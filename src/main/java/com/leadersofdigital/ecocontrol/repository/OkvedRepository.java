package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.Okved;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OkvedRepository extends JpaRepository<Okved, UUID> {
}
