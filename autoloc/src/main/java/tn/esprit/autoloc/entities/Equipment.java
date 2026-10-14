package tn.esprit.autoloc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Equipment {

    @Id
    long idEquipment;

    String label;

    @ManyToMany(mappedBy = "equipments")
    List<Vehicle> vehicles;
}