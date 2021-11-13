package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OkvedDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OkvedDtoUpdateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.OkvedDtoResponse;
import com.leadersofdigital.ecocontrol.api.mapper.OkvedMapper;
import com.leadersofdigital.ecocontrol.entity.Okved;
import com.leadersofdigital.ecocontrol.service.OkvedService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Tag(name = "Okved")

@RestController
@RequestMapping("/okveds")
public class OkvedController {
    private final OkvedService service;
    private final OkvedMapper mapper;

    public OkvedController(OkvedService service, OkvedMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/")
    @Operation(summary = "Get all okveds")
    public List<OkvedDtoResponse> findAll() {
        return service.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/")
    @Operation(summary = "Create new okved")
    public OkvedDtoResponse create(@RequestBody @Valid OkvedDtoCreateRequest request) {
        return mapper.toDto(
                service.create(
                        mapper.toEntity(request)));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete okved")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

    @PutMapping("/")
    @Operation(summary = "Update okved info")
    public OkvedDtoResponse update(@RequestBody @Valid OkvedDtoUpdateRequest updateRequest) {
        Okved okved = service.findById(updateRequest.getId());
        mapper.toEntity(updateRequest, okved);
        return mapper.toDto(service.create(okved));
    }
}
