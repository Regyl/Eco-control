package com.leadersofdigital.ecocontrol.repository;

import com.leadersofdigital.ecocontrol.entity.Mark;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MarkRepository extends JpaRepository<Mark, UUID> {

    List<Mark> findAllByPollutionType(PollutionType pollutionType);
}
