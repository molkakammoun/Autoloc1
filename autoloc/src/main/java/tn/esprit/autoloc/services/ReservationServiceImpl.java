package tn.esprit.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository; // adjust to your actual repository package if different

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository rrep;

    @Override
    public Reservation addReservation(Reservation r) {
        return rrep.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return rrep.save(r);
    }

    @Override
    public void deleteReservation(long idreservation) {
        rrep.deleteById(idreservation);
    }

    @Override
    public Reservation findReservation(long idreservation) {
        return rrep.findById(idreservation).orElse(null);
    }

    @Override
    public List<Reservation> getListReservations() {
        return rrep.findAll();
    }

    @Override
    public List<Reservation> addlistReservations(List<Reservation> reservations) {
        return rrep.saveAll(reservations);
    }
}