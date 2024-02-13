package com.example.pfe.backend.Interfaces;

import com.example.pfe.backend.models.AppelOffre;
import com.example.pfe.backend.models.Entretien;

import java.util.List;

public interface EntretienInterface {

    public List<Entretien> getAllInterview();
    public Entretien getInterviewById(Long id);
    public void deleteInterviewById(Long id);


}
