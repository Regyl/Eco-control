package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoUpdateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.OrganizationDtoResponse;
import com.leadersofdigital.ecocontrol.api.mapper.OrganizationMapper;
import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Organizations", description = "Create/read/update organizations")

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    private final OrganizationService service;
    private final OrganizationMapper mapper;

    public OrganizationController(OrganizationService service, OrganizationMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/all")
    @Operation(summary = "Returns all organizations")
    public List<OrganizationDtoResponse> findAll() {
        return service.findAll().stream()
                .map(OrganizationDtoResponse::of)
                .collect(Collectors.toList());
    }

    @GetMapping("/")
    @Operation(summary = "Returns all organizations by pages")
    public List<OrganizationDtoResponse> findAllWithPagination(@RequestParam("start") int start,
                                                               @RequestParam("size") int size) {
        return service.findAll(PageRequest.of(start, size)).stream()
                .map(OrganizationDtoResponse::of)
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    @Operation(summary = "Create new organization")
    @ResponseStatus(HttpStatus.CREATED)
    public OrganizationDtoResponse create(@RequestBody OrganizationDtoCreateRequest createRequest) {
        return OrganizationDtoResponse.of(
                service.create(
                        mapper.toEntity(createRequest)));
    }

    @PatchMapping("/")
    @Operation(summary = "Update organization data")
    public OrganizationDtoResponse update(@RequestBody OrganizationDtoUpdateRequest updateRequest) {
        Organization organization = service.findById(updateRequest.getId());
        mapper.toEntity(updateRequest, organization);
        return OrganizationDtoResponse.of(service.create(organization));
    }
}