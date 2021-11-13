package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import com.leadersofdigital.ecocontrol.exception.EntityNotFoundException;
import com.leadersofdigital.ecocontrol.repository.OkvedRepository;
import com.leadersofdigital.ecocontrol.repository.OrganizationRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    private final OrganizationRepository repository;
    private final OkvedRepository okvedRepository;

    public OrganizationService(OrganizationRepository repository, OkvedRepository okvedRepository) {
        this.repository = repository;
        this.okvedRepository = okvedRepository;
    }

    public void saveAll(Iterable<Organization> organizations) {
        repository.saveAll(organizations);
    }

    public List<Organization> findAll() {
        return repository.findAll();
    }

    public Page<Organization> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Organization findById(Long id) {
        return repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Organization create(Organization organization) {
        return repository.save(organization);
    }

    public List<Organization> findAllSorted(PollutionType pollutionType) {
        return repository.findAllByPollutionType(pollutionType);
    }

    public void deleteById(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException();
        }
    }

    public void checkOkvedSafety(Organization organization) {
        //TODO:
    }
}
