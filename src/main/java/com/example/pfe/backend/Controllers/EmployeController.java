package com.example.pfe.backend.Controllers;

import com.example.pfe.backend.Services.EmployeService;
import com.example.pfe.backend.models.Employe;
import com.example.pfe.backend.models.dto.EmployeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/employer")

public class EmployeController {

    private EmployeService employservice;

    @GetMapping
    public List<Employe> recupererToutEmployer(){
        return  employservice.getAllEmployes();

    }
    @DeleteMapping()
public void supprimerEmployer(Employe e){
        employservice.deleteEmploye(e);
    }
@PostMapping
    public Employe ajouterUnEmployer(Employe e){
        return employservice.addEmploye(e);
}
    @PostMapping("/employees/update")
    public ResponseEntity<Employe> update(@RequestBody Employe employe) {
        try {
            employservice.update(employe);
            return new ResponseEntity<Employe>(employe, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Employe>(HttpStatus.NOT_ACCEPTABLE);
        }

}
@PostMapping("/save")
    public String SaveEmploye(@RequestBody EmployeDto employeDto){
        String id= employservice.AddEmploye( employeDto);
        return id;
}




}

