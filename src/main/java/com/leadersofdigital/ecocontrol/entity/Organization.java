package com.leadersofdigital.ecocontrol.entity;

import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
public class Organization {
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private Long inn;

    @NotEmpty
    private String name;

    @NotNull
    @Column
    private Location location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id")
    private Set<Penalty> penaltySet;

    @NotNull
    @Enumerated(EnumType.STRING)
    private OrganizationType organizationType;

    private String okved;

    private String workType;

    private String address;
}
