package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class PenaltyDtoRequest {

    @NotNull
    private LocalDate date;

    @NotNull
    private String uin; //УИН штрафа

}
