package com.leadersofdigital.ecocontrol.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
public class Okved {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private Integer nvos; //НВОС

    private String description;

    @Column(nullable = false)
    private Boolean isDanger;

}
