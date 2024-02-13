package com.example.pfe.backend.models.dto;

import com.example.pfe.backend.models.Candidat;
import jakarta.persistence.ManyToMany;
public class CondidatDto {
     private Long idcandisat;
    private String diplome;

    public CondidatDto(String diplome, UserDto user) {
        this.diplome = diplome;
        this.user = user;
    }

    @ManyToMany
    private UserDto user;

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
