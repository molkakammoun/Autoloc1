package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Maintenance {

    @Id
    long idMaintenance;

    LocalDate startDate;
    LocalDate endDate;
    String description;

    @ManyToOne
    Vehicle vehicle;
}