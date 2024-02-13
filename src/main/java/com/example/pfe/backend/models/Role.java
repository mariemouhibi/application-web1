package com.example.pfe.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    private  Long id;
    private String name;
    private  String description;



    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();


    public void setName(String name) {
        this.name = name;
    }
}
