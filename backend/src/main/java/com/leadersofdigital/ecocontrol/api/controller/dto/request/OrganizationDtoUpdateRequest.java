package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;

@Data
public class OrganizationDtoUpdateRequest {

    @NotNull
    private UUID id;

    private Long inn;

    private String name;

    private Location location;

    private Set<PenaltyDtoRequest> penalty;

    private OrganizationType organizationType;

    private Set<OkvedDtoCreateRequest> okveds;

    private String address;
}
