package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEquipement extends JpaRepository<Equipment,Long> {
}
