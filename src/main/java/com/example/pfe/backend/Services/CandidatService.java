package com.example.pfe.backend.Services;
import com.example.pfe.backend.Interfaces.CandidatInterface;
import com.example.pfe.backend.Repositories.AppelOffreRepo;
import com.example.pfe.backend.Repositories.CandidatRepo;
import com.example.pfe.backend.models.AppelOffre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatService implements CandidatInterface {

    @Autowired
    private CandidatRepo candidatrepo;
    @Autowired
    private AppelOffreRepo offrerepo;
    @Override
    public List<AppelOffre> getAllOffres() {
        return offrerepo.findAll() ;
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
    public AppelOffre  addOffre (AppelOffre offre){
        return offrerepo.save(offre);
    }

    @Override
    public void updateCv() {

    }
}
