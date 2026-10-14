package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    void deleteReservation(long idreservation);
    Reservation findReservation(long idreservation);
    List<Reservation> getListReservations();
    List<Reservation> addlistReservations(List<Reservation> reservations);

}
