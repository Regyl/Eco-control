package com.leadersofdigital.ecocontrol.entity;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.OrganizationDtoCreateRequest;
import com.leadersofdigital.ecocontrol.entity.enums.OrganizationType;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

  @NotNull
  @Column(nullable = false)
  private Long inn;

  @NotEmpty
  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Location location;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "organization_id")
  private Set<Penalty> penaltySet;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private OrganizationType organizationType;

  @ManyToMany
  @JoinColumn
  private Set<Okved> okveds;

  private String workType;

  @Column(nullable = false)
  private String address;
}
