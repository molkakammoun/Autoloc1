package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryContract extends JpaRepository<Contract,Long> {
}
