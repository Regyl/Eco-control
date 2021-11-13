package com.leadersofdigital.ecocontrol.entity;

import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private Long inn;

  @NotEmpty
  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Location location;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "organization_id")
  private Set<Penalty> penalty;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private OrganizationType organizationType;

  @Enumerated(EnumType.STRING)
  private PollutionType pollutionType;

  @ManyToMany
  @JoinColumn
  private Set<Okved> okveds;

  @Column(nullable = false)
  private Boolean isOkvedDanger;

  @Column(nullable = false)
  private String address;
}
