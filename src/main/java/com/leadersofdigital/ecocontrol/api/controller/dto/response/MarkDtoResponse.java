package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Mark;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.Data;

import java.io.File;
import java.time.LocalDateTime;

@Data
public class MarkDtoResponse {

    private Location location;
    private PollutionType pollutionType;
    private String description;
    private LocalDateTime createdAt;
    private File image;
}
