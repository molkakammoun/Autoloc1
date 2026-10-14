package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAgency extends JpaRepository<Agency,Long> {
}
