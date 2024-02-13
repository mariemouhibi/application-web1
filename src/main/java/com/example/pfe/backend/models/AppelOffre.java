package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;

@Entity
@DynamicUpdate
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppelOffre {

    @Id
    @GeneratedValue
    private Long idoffre;
    private String poste;
    @Column(name="description",columnDefinition = "text")
    private String description;
    private LocalDate Date;
@ManyToOne
    private Societe IdSocite;
@OneToOne
    private Request IdRequest;

    // societe-(one sct have many offre)
    //date
    //request( un apple d'offre have many request)


}
