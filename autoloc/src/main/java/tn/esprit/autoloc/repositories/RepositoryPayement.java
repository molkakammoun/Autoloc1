package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPayement extends JpaRepository<Payment,Long> {
}
