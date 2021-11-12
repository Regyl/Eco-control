package com.leadersofdigital.ecocontrol.entity;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mark implements Serializable {

  private static final long serialVersionUID = 4099836772284228713L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private Location location;

  private String description;

  @ManyToOne(cascade = {CascadeType.ALL})
  private AppUser user;

  @Lob
  private Byte[] img;

  @Column(nullable = false)
  private LocalDateTime createdAt;

  @PrePersist
  public void fillCreatedTime() {
    createdAt = LocalDateTime.now();
  }

}
