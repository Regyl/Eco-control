package com.leadersofdigital.ecocontrol.api.dto.response;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Mark;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MarkDtoResponse {

    private Location location;
    private PollutionType pollutionType;
    private String description;
    private LocalDateTime createdAt;


    public static MarkDtoResponse of(Mark mark) {
        MarkDtoResponse dto = new MarkDtoResponse();
        dto.location= mark.getLocation();
        dto.pollutionType=mark.getPollutionType();
        dto.description= mark.getDescription();
        dto.createdAt=mark.getCreatedAt();
        return dto;
    }
}
