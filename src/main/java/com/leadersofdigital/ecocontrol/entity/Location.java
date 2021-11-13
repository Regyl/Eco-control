package com.leadersofdigital.ecocontrol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Location implements Serializable {

  private static final long serialVersionUID = 8190568668314860467L;

  private double latitude;
  private double longitude;
}
