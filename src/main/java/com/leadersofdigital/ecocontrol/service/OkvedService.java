package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.entity.Okved;
import com.leadersofdigital.ecocontrol.exception.EntityNotFoundException;
import com.leadersofdigital.ecocontrol.repository.OkvedRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OkvedService {
    private final OkvedRepository repository;

    public OkvedService(OkvedRepository repository) {
        this.repository = repository;
    }

    public List<Okved> findAll() {
        return repository.findAll();
    }

    public Okved create(Okved okved) {
        return repository.save(okved);
    }

    public void deleteById(UUID id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException();
        }
    }

    public Okved findById(UUID id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
