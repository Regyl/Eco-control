package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.AccessedPolluter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccessedPolluterRepository extends JpaRepository<AccessedPolluter, UUID> {
}
