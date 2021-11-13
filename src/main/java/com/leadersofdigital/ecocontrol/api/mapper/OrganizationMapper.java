package com.leadersofdigital.ecocontrol.api.mapper;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoUpdateRequest;
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
        return mapper.map(request, Organization.class);
    }

    public void toEntity(OrganizationDtoUpdateRequest request, Organization organization) {
        mapper.map(request, organization);
    }
}
