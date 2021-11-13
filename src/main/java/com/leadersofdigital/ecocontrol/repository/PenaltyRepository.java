package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.Penalty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PenaltyRepository extends JpaRepository<Penalty, UUID> {

    Optional<Penalty> findByUinContains(String uin);
}
