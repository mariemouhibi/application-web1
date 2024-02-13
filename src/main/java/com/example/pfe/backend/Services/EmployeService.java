package com.example.pfe.backend.Services;

import com.example.pfe.backend.Interfaces.EmployeInterface;
import com.example.pfe.backend.Repositories.EmployeRepo;
import com.example.pfe.backend.models.Employe;
import com.example.pfe.backend.models.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService implements EmployeInterface {
    @Autowired
    private EmployeRepo employerepo;

    PasswordEncoder passwordEncoder;



    public void deleteEmploye(Employe employe) {
        if (employe != null)
            employerepo.delete(employe);

    }

    @Override
    public List<Employe> getAllEmployes() {
        return  employerepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return employerepo.save(e);
    }

    @Override
    public EmployeInterface updateProfil(EmployeInterface e) {
        return null;
    }
    public ResponseEntity<Employe> update(Employe employe){
        return null;

    }

    @Override
    public String AddEmploye(EmployeDto employeDto) {
        Employe employe=new Employe(
                employeDto.getIdemploye(),
                employeDto.getName(),
                employeDto.getEmail(),
                this.passwordEncoder.encode(employeDto.getPassword())
        );
        employerepo.save(employe);
        return employe.getName();
    }

}
