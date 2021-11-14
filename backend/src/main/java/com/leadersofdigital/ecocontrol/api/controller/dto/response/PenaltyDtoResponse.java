package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class PenaltyDtoResponse {

    private UUID id;

    private LocalDate date;

    private String uin;
}
