package com.leadersofdigital.ecocontrol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table(name = "app_user")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = 8249930734881262335L;

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private Set<Mark> marks;

  @ManyToMany(fetch = FetchType.EAGER)
  private Set<Role> roles;
}
