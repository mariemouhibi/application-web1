package com.example.pfe.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
@Entity
@Table
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entretien {

    @Id
    private Long IdEntrtien;
   private Date Date;
    private String Lieu;
    private String  Type;
    private String Avis;
    private String  Statue;

    @ManyToOne
    private Request req  ;
    @ManyToOne
    private Candidat IdCandidat;
    @ManyToOne
    private Employe Intervenant;


}
