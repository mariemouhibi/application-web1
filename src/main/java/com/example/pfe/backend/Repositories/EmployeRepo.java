package com.example.pfe.backend.Repositories;

import com.example.pfe.backend.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface EmployeRepo extends JpaRepository<Employe ,Long> {
    Optional<Employe> findByEmailAndPassword(String Email , String Password);
    Employe findByEmail(String Email);
}
