package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.MarkDtoResponse;
import com.leadersofdigital.ecocontrol.api.mapper.MarkMapper;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import com.leadersofdigital.ecocontrol.service.MarkService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Tag(name = "Complaints", description = "Create/read complaints from citizens")

@RestController
@RequestMapping("/marks")
public class MarkController {
    private final MarkService service;
    private final MarkMapper mapper;

    public MarkController(MarkService service, MarkMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create new complaint")
    public MarkDtoResponse createMark(@RequestBody @Valid MarkDtoRequest request) {
        return mapper.toDto(service.create(request));
    }

    @GetMapping("/")
    @Operation(summary = "All people complaints")
    public List<MarkDtoResponse> findAll() {
        return service.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/sort")
    @Operation(summary = "All complaints sorted by pollutionType")
    public List<MarkDtoResponse> findAllSorted(@RequestParam PollutionType pollutionType) {
        return service.findAllByPollutionType(pollutionType).stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete mark")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }
}
