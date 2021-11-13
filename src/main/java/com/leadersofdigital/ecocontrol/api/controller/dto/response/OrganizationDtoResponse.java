package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Okved;
import com.leadersofdigital.ecocontrol.entity.Penalty;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.Data;

import java.util.Set;

@Data
public class OrganizationDtoResponse {

    private Long id;

    private Long inn;

    private String name;

    private Location location;

    private Set<Penalty> penalty;

    private OrganizationType organizationType;

    private Set<Okved> okveds;

    private Boolean isOkvedDanger;

    private String address;

    private PollutionType pollutionType;
}
