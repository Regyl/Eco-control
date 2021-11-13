package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoUpdateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.OrganizationDtoResponse;
import com.leadersofdigital.ecocontrol.api.mapper.OrganizationMapper;
import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import com.leadersofdigital.ecocontrol.exception.InvalidRequestException;
import com.leadersofdigital.ecocontrol.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
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

    @GetMapping("/penalty")
    @Operation(summary = "")
    public List<OrganizationDtoResponse> findAllWithPenalty() {
        return service.findAllWithPenalty().stream()
                .map(mapper::toDto)
                .distinct()
                .collect(Collectors.toList());
    }

    @GetMapping("/search")
    @Operation(summary = "Organization by it's inn/address/penalty UIN")
    public OrganizationDtoResponse findAllSorted(@RequestParam(name = "inn", required = false) Long inn,
                                                       @RequestParam(name = "uin", required = false) String uin,
                                                       @RequestParam(name = "address", required = false) String address) {
        if(inn != null) {
            return mapper.toDto(service.findByInn(inn));
        } else if (address != null) {
            return mapper.toDto(service.findByAddress(address));
        } else if (uin != null) {
            return mapper.toDto(service.findByUin(uin));
        } else {
            throw new InvalidRequestException();
        }
    }

    @GetMapping("/all")
    @Operation(summary = "Returns all organizations")
    public List<OrganizationDtoResponse> findAll() {
        return service.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/")
    @Operation(summary = "Returns all organizations by pages")
    public List<OrganizationDtoResponse> findAllWithPagination(@RequestParam("start") int start,
                                                               @RequestParam("size") int size) {
        return service.findAll(PageRequest.of(start, size)).stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    @Operation(summary = "Create new organization")
    @ResponseStatus(HttpStatus.CREATED)

    public OrganizationDtoResponse create(@RequestBody @Valid OrganizationDtoCreateRequest createRequest) {
        return mapper.toDto(
                service.create(
                        mapper.toEntity(createRequest)));
    }

    @PatchMapping("/")
    @Operation(summary = "Update organization data")
    public OrganizationDtoResponse update(@RequestBody @Valid OrganizationDtoUpdateRequest updateRequest) {
        Organization organization = service.findById(updateRequest.getId());
        mapper.toEntity(updateRequest, organization);
        return mapper.toDto(service.create(organization));
    }

    @GetMapping("/sort")
    @Operation(summary = "Get organizations sorted by pollution type")
    public List<OrganizationDtoResponse> findAllSorted(@RequestParam PollutionType pollutionType) {
        return service.findAllSorted(pollutionType).stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete organization")
    public void deleteById(@PathVariable("id") UUID id) {
        service.deleteById(id);
    }
}
