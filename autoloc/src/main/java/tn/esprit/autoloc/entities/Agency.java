package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Agency {

    @Id
    long idAgency;

    String name;
    String city;
    String address;
    String phone;

    @OneToMany(mappedBy = "agency")
    List<Employee> employees;

    @OneToMany(mappedBy = "agency")
    List<Vehicle> vehicles;
}