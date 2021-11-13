package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.entity.Mark;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import com.leadersofdigital.ecocontrol.exception.EntityNotFoundException;
import com.leadersofdigital.ecocontrol.repository.MarkRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MarkService {
    private final MarkRepository repository;

    public MarkService(MarkRepository repository) {
        this.repository = repository;
    }

    public Mark create(MarkDtoRequest request) {
        return repository.save(new Mark(request));
    }

    public List<Mark> findAll() {
        return repository.findAll();
    }

    public List<Mark> findAllByPollutionType(PollutionType pollutionType) {
        return repository.findAllByPollutionType(pollutionType);
    }

    public void deleteById(UUID id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException();
        }
    }
}
