package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.entity.Mark;
import com.leadersofdigital.ecocontrol.repository.MarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
