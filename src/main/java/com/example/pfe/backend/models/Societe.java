package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Societe {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String activité;



    @OneToOne
    private Employe employe;
}



