package com.leadersofdigital.ecocontrol.api.mapper;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.api.controller.dto.response.MarkDtoResponse;
import com.leadersofdigital.ecocontrol.entity.Mark;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MarkMapper {
    private final ModelMapper mapper;

    public MarkMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Mark toEntity(MarkDtoRequest dtoRequest) {
        return mapper.map(dtoRequest, Mark.class);
    }

    public MarkDtoResponse toDto(Mark mark) {
        return mapper.map(mark, MarkDtoResponse.class);
    }
}
