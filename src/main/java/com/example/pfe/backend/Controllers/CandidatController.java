package com.example.pfe.backend.Controllers;

import com.example.pfe.backend.Services.CandidatService;
import com.example.pfe.backend.models.AppelOffre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping ("api/candidats")
public class CandidatController {

    @Autowired
    private CandidatService candidatservice;

    @GetMapping
    public List<AppelOffre> RecupererToutlesOffres (){
        return candidatservice.getAllOffres();
    }
    @GetMapping("/{id}")
    public AppelOffre  recupererOffreById (@PathVariable("id")Long id){
        return candidatservice.getOffreById(id);
    }
@PostMapping
    public AppelOffre ajouteruneoffre(AppelOffre offre){
       return candidatservice. addOffre(offre);
    }
    @DeleteMapping({"/{id}"})
    public  void supprimeruneoofreById(@PathVariable("id")Long id){
        candidatservice.deleteOffreById(id);
    }


}
