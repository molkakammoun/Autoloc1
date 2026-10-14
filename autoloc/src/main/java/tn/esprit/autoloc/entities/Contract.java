package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Contract {

    @Id
    long idContract;

    LocalDate signatureDate;

    BigDecimal totalAmount;

    boolean valid;

    @OneToOne(mappedBy = "contract")
    Reservation reservation;

    @OneToMany(mappedBy = "contract")
    List<Payment> payments;
}