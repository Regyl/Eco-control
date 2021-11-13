package com.leadersofdigital.ecocontrol.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

import com.leadersofdigital.ecocontrol.api.controller.dto.request.MarkDtoRequest;
import com.leadersofdigital.ecocontrol.entity.enums.PollutionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Log
public class Mark implements Serializable {

  private static final long serialVersionUID = 4099836772284228713L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(nullable = false)
  private Location location;

  private String description;

  @ManyToOne(cascade = {CascadeType.ALL})
  private User user;

  @Lob
  private byte[] img;

  @Enumerated(EnumType.STRING)
  private PollutionType pollutionType;

  @Column(nullable = false)
  private LocalDateTime createdAt;

  @PrePersist
  public void fillCreatedTime() {
    createdAt = LocalDateTime.now();
  }

  public Mark(MarkDtoRequest dtoRequest) {
    this.location = new Location(dtoRequest.getLatitude(), dtoRequest.getLongitude());
    this.pollutionType=dtoRequest.getPollutionType();
    this.description= dtoRequest.getDescription();

    try {
      this.img = dtoRequest.getImage().getBytes();
    } catch (Exception e) {
      log.warning(e.getMessage());
    }
  }

}
