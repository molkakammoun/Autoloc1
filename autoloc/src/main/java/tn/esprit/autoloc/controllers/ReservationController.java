package tn.esprit.autoloc.controllers;
import tn.esprit.autoloc.entities.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private final tn.esprit.autoloc.services.IReservationService ires;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r) {
        return ires.addReservation(r);
    }
    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation r) {
        return ires.updateReservation(r);
    }
    @DeleteMapping("/deleteReservation/{idReservation}")
        void deleteReservation(@PathVariable long idReservation){
        ires.deleteReservation(idReservation);
        }
    @GetMapping("getReservation/{idReservation}")
    Reservation findReservation(@PathVariable long idReservation){
        return ires.findReservation(idReservation);
    }
    @GetMapping("getListReservation")
    List<Reservation> getListReservation(){
        return ires.getListReservations();
    }
    @PostMapping("addlistReservation")
    List<Reservation> addlistReservation(@RequestBody List<Reservation> reservations){
        return ires.addlistReservations(reservations);}

}
