package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.entity.AccessedPolluter;
import com.leadersofdigital.ecocontrol.repository.AccessedPolluterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessedPolluterService {
    private final AccessedPolluterRepository repository;

    public AccessedPolluterService(AccessedPolluterRepository repository) {
        this.repository = repository;
    }

    public void saveAll(Iterable<AccessedPolluter> polluters) {
        repository.saveAll(polluters);
    }

    public List<AccessedPolluter> findAll(Pageable pageable) {
        return repository.findAll(pageable).getContent();
    }
}
