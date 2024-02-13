package com.example.pfe.backend.Controllers;

import com.example.pfe.backend.Services.RecruteurService;
import com.example.pfe.backend.models.Candidat;
import com.example.pfe.backend.models.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/recruiter")
public class RecruteurController {

    @Autowired
    private RecruteurService recruteurservices;

    @PostMapping
    public Candidat ajouterCandidat(@RequestBody Candidat c) {
        return recruteurservices.addCandidat(c);
    }

    @GetMapping("/all-candidats")
    public List<Candidat> recupererAllCandidats() {
        return recruteurservices.getAllCandidat();
    }
    @GetMapping("/{id}")
    public Candidat recupererCandidatById(@PathVariable("id") Long id){
        return recruteurservices.getCandidatById(id);
    }
    @DeleteMapping("/{id}")
    public void supprimerCandidatById(@PathVariable("id")Long id){
        recruteurservices.deleteCandidatById(id);
    }
    @PostMapping("/employe")
    public Employe ajouterEmploye(Employe e){
        return recruteurservices.addEmploye(e);
}
@GetMapping("/all-employe")
    public List<Employe> recupererToutEmploye(){
        return recruteurservices.getAllEmploye();

}


}

