package com.leadersofdigital.ecocontrol.api.mapper;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OkvedDtoCreateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.request.OkvedDtoUpdateRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.OkvedDtoResponse;
import com.leadersofdigital.ecocontrol.entity.Okved;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class OkvedMapper {
    private final ModelMapper mapper;

    public OkvedMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public OkvedDtoResponse toDto(Okved okved) {
        return mapper.map(okved, OkvedDtoResponse.class);
    }

    public Okved toEntity(OkvedDtoCreateRequest request) {
        return mapper.map(request, Okved.class);
    }

    public void toEntity(OkvedDtoUpdateRequest updateRequest, Okved okved) {
        mapper.map(updateRequest, okved);
    }
}
