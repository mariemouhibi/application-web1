package com.example.pfe.backend.Services;
import com.example.pfe.backend.Interfaces.EntretienInterface;
import com.example.pfe.backend.Repositories.EntretienRepo;
import com.example.pfe.backend.models.Entretien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EntretienService implements EntretienInterface {
    @Autowired
    EntretienRepo entretienrepo;
    @Override
    public List<Entretien> getAllInterview() {
        return entretienrepo.findAll();
    }

    @Override
    public Entretien getInterviewById(Long id) {
        Optional<Entretien> c = entretienrepo.findById(id);
        return c.isPresent() ? c.get() : null;
    }

    @Override
    public void deleteInterviewById(Long id) {
        entretienrepo.deleteById(id);
    }

}

