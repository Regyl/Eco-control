package com.leadersofdigital.ecocontrol.api.controller.dto.request;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Penalty;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class OrganizationDtoUpdateRequest {

    @NotNull
    private Long id;

    private Long inn;

    private String name;

    private Location location;

    private Set<PenaltyDtoRequest> penalty;

    private OrganizationType organizationType;

    private Set<OkvedDtoRequest> okveds;

    private String address;
}
