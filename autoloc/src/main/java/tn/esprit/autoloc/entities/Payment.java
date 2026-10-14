package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Payment {

    @Id
    long idPayment;

    BigDecimal amount;

    LocalDate paymentDate;

    PaymentMethod paymentMethod;

    @ManyToOne
    Contract contract;
}