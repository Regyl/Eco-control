package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import com.leadersofdigital.ecocontrol.entity.Location;
import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.entity.Penalty;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class OrganizationDtoResponse {

    private Long inn;

    private String name;

    private Location location;

    private Set<Penalty> penaltySet;

    private OrganizationType organizationType;

    private String okved;

    private String workType;

    private String address;
}
