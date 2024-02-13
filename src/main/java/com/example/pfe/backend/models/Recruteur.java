package com.example.pfe.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Set;
@Entity
@Table
public class Recruteur {
    @Id
    @GeneratedValue
    private Long idrecruteur;
}
