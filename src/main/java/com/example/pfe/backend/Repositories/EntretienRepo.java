package com.example.pfe.backend.Repositories;

import com.example.pfe.backend.models.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EntretienRepo extends JpaRepository<Entretien,Long> {
}
