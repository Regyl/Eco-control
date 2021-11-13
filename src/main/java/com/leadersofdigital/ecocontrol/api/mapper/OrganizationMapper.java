package com.leadersofdigital.ecocontrol.api.mapper;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoUpdateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.OrganizationDtoResponse;
import com.leadersofdigital.ecocontrol.entity.Organization;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OrganizationMapper {
    private final ModelMapper mapper;

    public OrganizationMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Organization toEntity(OrganizationDtoCreateRequest request) {
        Organization organization = mapper.map(request, Organization.class);
        organization.setIsOkvedDanger(false);
        return organization;
    }

    public void toEntity(OrganizationDtoUpdateRequest request, Organization organization) {
        mapper.map(request, organization);
    }

    public OrganizationDtoResponse toDto(Organization organization) {
        return mapper.map(organization, OrganizationDtoResponse.class);
    }
}
