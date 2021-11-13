package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class OkvedDtoCreateRequest {
    @NotNull
    private String value;

    @NotNull
    private Integer nvos; //НВОС

    private String description;

    @NotNull
    private Boolean isDanger;
}
