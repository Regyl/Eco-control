package com.leadersofdigital.ecocontrol.entity;

import lombok.Data;

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

    @NotNull
    private String value;

    @NotNull
    private Integer nvos; //НВОС
}
