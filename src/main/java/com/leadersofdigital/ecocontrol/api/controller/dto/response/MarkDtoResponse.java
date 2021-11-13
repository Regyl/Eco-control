package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.Data;

import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class MarkDtoResponse {

    private UUID id;

    private Location location;

    private PollutionType pollutionType;

    private String description;

    private LocalDateTime createdAt;

    private File image;
}
