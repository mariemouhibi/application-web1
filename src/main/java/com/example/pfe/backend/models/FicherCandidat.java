package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FicherCandidat {
    @Id
    @GeneratedValue
    private Long IdFicher;
    private String Nom;
    private Long CondidatID;

    @OneToOne
    private Candidat IdCandidat;

    @OneToMany(mappedBy = "ficherCandidat", cascade = CascadeType.ALL)
    private List<Request> requests;
}
