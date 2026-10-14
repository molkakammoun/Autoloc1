package tn.esprit.autoloc_auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domain.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
