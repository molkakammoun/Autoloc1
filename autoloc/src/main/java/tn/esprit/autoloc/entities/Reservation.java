package tn.esprit.autoloc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;

    LocalDate startDate;
    LocalDate endDate;

    ReservationStatus reservationStatus;

    @ManyToOne
    Vehicle vehicle;

    @ManyToOne
    Client client;

    @OneToOne
    Contract contract;
}