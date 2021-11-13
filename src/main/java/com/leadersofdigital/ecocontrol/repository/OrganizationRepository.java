package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.Organization;
import com.leadersofdigital.ecocontrol.entity.Penalty;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, UUID> {

    List<Organization> findAllByPollutionType(PollutionType pollutionType);

    Optional<Organization> findByInn(Long inn);

    Optional<Organization> findByAddressContains(String address);

    Optional<Organization> findByPenalty(Penalty penalty);
}
