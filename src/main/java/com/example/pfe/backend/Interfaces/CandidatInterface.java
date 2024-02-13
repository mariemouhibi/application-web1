package com.example.pfe.backend.Interfaces;

import com.example.pfe.backend.models.AppelOffre;

import java.util.List;

public interface CandidatInterface {

    public List<AppelOffre> getAllOffres();
    public AppelOffre getOffreById(Long id);
    public void deleteOffreById(Long id);
    public AppelOffre addOffre (AppelOffre offre);
    public void updateCv();
}
