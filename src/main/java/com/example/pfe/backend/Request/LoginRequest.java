package com.example.pfe.backend.Request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
public class LoginRequest {

   @Id
   @GeneratedValue
   private long idreq;
    private String username;
    private String password;



    }

