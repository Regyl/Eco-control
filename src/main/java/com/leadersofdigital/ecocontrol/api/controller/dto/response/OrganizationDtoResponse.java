package com.leadersofdigital.ecocontrol.api.controller.dto.response;

import com.leadersofdigital.ecocontrol.entity.Organization;
import lombok.Data;

@Data
public class OrganizationDtoResponse {

    public static OrganizationDtoResponse of(Organization organization) {
        OrganizationDtoResponse response = new OrganizationDtoResponse();

        return response;
    }
}
