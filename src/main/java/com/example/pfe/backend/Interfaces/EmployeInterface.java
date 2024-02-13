package com.example.pfe.backend.Interfaces;

import com.example.pfe.backend.models.Employe;
import com.example.pfe.backend.models.dto.EmployeDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeInterface {
    public List<Employe> getAllEmployes();
    public Employe addEmploye(Employe e);
    public EmployeInterface updateProfil(EmployeInterface e);
    public ResponseEntity<Employe> update(Employe employe);
    public String AddEmploye(EmployeDto employeDto);
}
