package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMaintenance extends JpaRepository<Maintenance,Long> {
}
