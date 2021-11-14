package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Data
public class MarkDtoRequest {

    @NotNull
    private Double latitude;

    @NotNull
    private Double longitude;

    private MultipartFile image;

    private String description;

    @NotNull
    private PollutionType pollutionType;


}
