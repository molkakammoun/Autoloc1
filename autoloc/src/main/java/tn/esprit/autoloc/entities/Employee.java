package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    long idEmployee;

    String name;
    String firstName;
    EmployeeRole role;

    @ManyToOne
    Agency agency;
}