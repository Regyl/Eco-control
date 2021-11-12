package com.leadersofdigital.ecocontrol.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class AccessedPolluter {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String name;

    private String inn;

    @Column(columnDefinition = "TEXT")
    private String address;
}
