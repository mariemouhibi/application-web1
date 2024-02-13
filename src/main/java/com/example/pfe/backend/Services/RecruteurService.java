package com.example.pfe.backend.Services;

import com.example.pfe.backend.Interfaces.RecruteurInterface;
import com.example.pfe.backend.Repositories.*;
import com.example.pfe.backend.models.AppelOffre;
import com.example.pfe.backend.models.Candidat;
import com.example.pfe.backend.models.Employe;
import com.example.pfe.backend.models.Entretien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RecruteurService implements RecruteurInterface {
     @Autowired
        private RecruteurRepo recruteurRepo;
       @Autowired
       private CandidatRepo candidatrepo;
        @Autowired
        private EmployeRepo employerepo;
        @Autowired
        private AppelOffreRepo offrerepo;
        @Autowired
        private EntretienRepo entretienrepo;

        @Override
        public Candidat addCandidat(Candidat c) {
            return candidatrepo.save(c);
        }
    @Override
    public List<Candidat> getAllCandidat() {
        return candidatrepo.findAll();
    }

    @Override
        public Candidat getCandidatById(Long id) {
            Optional<Candidat> c= candidatrepo.findById(id);
            return c.isPresent() ? c.get() : null;
        }

        @Override
        public void deleteCandidatById(Long id) {

            candidatrepo.deleteById(id);
        }

        @Override
        public Employe addEmploye(Employe E) {
            return employerepo.save(E);
        }

    @Override
    public List<Employe> getAllEmploye() {
        return employerepo.findAll();
    }

        @Override
        public Employe getEmployeById(Long id) {
            Optional<Employe> c = employerepo.findById(id);
            return c.isPresent() ? c.get() : null;
        }

        @Override
        public void deleteEmployeById(Long id) {
            employerepo.deleteById(id);
        }

        @Override
        public Entretien addEntretien(Entretien e) {
            return entretienrepo.save(e);
        }

        @Override
        public List<Entretien> getAllEntretien(Entretien e) {
            return entretienrepo.findAll();
        }

        @Override
        public Entretien updateEntretien(Entretien e) {
            return entretienrepo.save(e);
        }

        @Override
        public AppelOffre addOffre (AppelOffre o) {
            return offrerepo.save(o);
        }

       @Override
    public List<AppelOffre> getAllOffres() {
        return offrerepo.findAll();
    }
        @Override
        public AppelOffre getOffreById(Long id) {
            return offrerepo.getReferenceById(id);
        }

        @Override
        public void deleteOffreById(Long id) {
            offrerepo.deleteById(id);
        }
    @Override
    public Long countEmploye() {

        return employerepo.count();

    }

}