package com.example.pfe.backend.Repositories;

import com.example.pfe.backend.models.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CandidatRepo extends JpaRepository<Candidat , Long> {
}
