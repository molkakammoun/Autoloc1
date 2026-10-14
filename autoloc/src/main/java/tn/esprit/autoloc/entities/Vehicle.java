package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    long vehicleId;

    String registrationNumber;
    String make;
    String model;

    VehicleCategory category;

    BigDecimal dailyRate;

    VehicleStatus status;

    @ManyToOne
    Agency agency;

    @OneToMany(mappedBy = "vehicle")
    List<Maintenance> maintenances;

    @OneToMany(mappedBy = "vehicle")
    List<Reservation> reservations;

    @ManyToMany
    List<Equipment> equipments;
}