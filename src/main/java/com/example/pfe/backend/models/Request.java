package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue
    private Long IdReq;
    private String Etat;
    private String cause;
    private LocalDateTime DateInscrit;


    @ManyToOne
    private AppelOffre offre;
    @OneToMany
    private List<Candidat> candidat;
    @OneToMany
    private List<Entretien> IdEntretien;
    @ManyToOne
    @JoinColumn(name = "ficher_candidat_id")
    private FicherCandidat ficherCandidat;
}


