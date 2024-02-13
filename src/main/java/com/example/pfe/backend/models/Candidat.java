package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidat  {
    @Id
    @GeneratedValue
    Long idcandisat;
    String diplome;

    @OneToOne
    private Request req;
    @OneToOne
    private Contact IdContact;
    @OneToOne
    private User user;

}