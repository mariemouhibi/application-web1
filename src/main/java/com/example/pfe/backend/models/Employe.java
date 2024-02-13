package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Employe")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class  Employe  {

    @Id
    @GeneratedValue
    private Long idemploye;
private String name;
private String email;
private String password;

    public Employe(Long idemploye, String name, String email, String password) {
        this.idemploye = idemploye;
        this.name = name;
        email = email;
        password = password;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "idemploye=" + idemploye +
                ", name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", societe=" + societe +
                ", idConatct=" + idConatct +
                '}';
    }

    @ManyToOne
    private Societe societe;
@OneToOne
    private Contact idConatct;
    /// contact









}


