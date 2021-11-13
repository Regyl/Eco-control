package com.leadersofdigital.ecocontrol.api.controller;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.MarkDtoResponse;
import com.leadersofdigital.ecocontrol.service.MarkService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Complaints", description = "Create/read complaints from citizens")

@RestController
@RequestMapping("/marks")
public class MarkController {
    private final MarkService service;

    public MarkController(MarkService service) {
        this.service = service;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create new complaint")
    public MarkDtoResponse createMark(@RequestBody MarkDtoRequest request) {
        return MarkDtoResponse.of(service.create(request));
    }

    @GetMapping("/")
    @Operation(summary = "All people complaints")
    public List<MarkDtoResponse> findAll() {
        return service.findAll().stream()
                .map(MarkDtoResponse::of)
                .collect(Collectors.toList());
    }
}
