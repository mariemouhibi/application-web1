package com.example.pfe.backend.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table
public class Conge {
 @Id
 @GeneratedValue
 private Long idCong;
    private String typeCong;
    private Date debutCong;
    private Date finCong;
    private Date createdAt;
    private String description;
    private int duree ;
    private int soldeConge ;

}
