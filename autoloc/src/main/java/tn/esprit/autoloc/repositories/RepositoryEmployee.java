package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee,Long> {
}
