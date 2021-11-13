package com.leadersofdigital.ecocontrol.service;

import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public void saveAll(Iterable<Organization> organizations) {
        repository.saveAll(organizations);
    }
}
