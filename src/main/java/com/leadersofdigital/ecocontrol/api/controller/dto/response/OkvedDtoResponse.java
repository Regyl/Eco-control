package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class OkvedDtoResponse {
    private UUID id;

    private String value;

    private Integer nvos; //НВОС

    private String description;

    private Boolean isDanger;
}
