package com.leadersofdigital.ecocontrol.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Penalty {
    @Id
    @GeneratedValue
    private UUID id;

}