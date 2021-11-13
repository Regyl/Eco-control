package com.leadersofdigital.ecocontrol.api.dto.request;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.PollutionType;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Data
public class MarkDtoRequest {

    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotNull
    private MultipartFile image;

    private String description;

    @NotNull
    private PollutionType pollutionType;


}
