package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Client {

    @Id
    long idClient;

    String name;
    String firstName;
    String email;
    String phone;
    String licenseNumber;
    LocalDate registrationDate;

    @OneToMany(mappedBy = "client")
    List<Reservation> reservations;
}