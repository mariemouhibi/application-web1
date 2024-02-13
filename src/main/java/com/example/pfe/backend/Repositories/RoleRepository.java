package com.example.pfe.backend.Repositories;

import com.example.pfe.backend.models.ERole;
import com.example.pfe.backend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}