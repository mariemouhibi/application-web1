package com.example.pfe.backend.JwtResponce;

import lombok.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    private String access_token;
    private String type = "Bearer";
    private String refresh_token;
    private Long id;
    private String username;
    private String email;

    private List<String> roles;
    private Instant expired_token_date;

    public JwtResponse(String accessToken, String refreshToken, Long id, String username, String email, List<String> roles, Instant date) {
        this.refresh_token = refreshToken;
        this.access_token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.expired_token_date=expired_token_date;
    }

}
