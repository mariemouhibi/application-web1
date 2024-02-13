package com.example.pfe.backend.Interfaces;

import com.example.pfe.backend.models.Candidat;
import com.example.pfe.backend.models.Employe;
import com.example.pfe.backend.models.Entretien;
import com.example.pfe.backend.models.AppelOffre;

import java.util.List;

public interface RecruteurInterface {
    public Candidat addCandidat(Candidat c);
    public List<Candidat> getAllCandidat();
    public Candidat getCandidatById(Long id);
    public void  deleteCandidatById(Long id);
    public Employe addEmploye(Employe E);
    public List<Employe> getAllEmploye();
    public Employe getEmployeById(Long id);
    public void  deleteEmployeById(Long id);
    public Entretien addEntretien(Entretien e);
    public List<Entretien> getAllEntretien(Entretien e);
    public Entretien updateEntretien(Entretien e);
    public AppelOffre addOffre (AppelOffre o);
    public List<AppelOffre> getAllOffres();
    public AppelOffre getOffreById(Long id);
    public void  deleteOffreById(Long id);
    public Long countEmploye() ;

}
