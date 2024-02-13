package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "contact")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactId")
    private Long idcontact;
    @Column(name = "FirstName")
    private String FirstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "Cin")
    private Long Cin;

    @Column(name = "Email")

    private String Email;
    @Column(name = "Sexe")
    private String Sexe;
    @Column(name = "Adresse")

    private String Adresse;
    @Column(name = "Age")

    private int Age;
    @Column(name = "DateOfBirth")

    private String DateOfBirth;
    @Column(name = "PhonrNumber")

    private Long PhoneNumber;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId")
    private User user;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "candidat")
    private Candidat candidat;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "employe")
    private Employe employe;

}