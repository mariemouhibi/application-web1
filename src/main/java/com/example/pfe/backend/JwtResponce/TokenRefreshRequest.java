package com.example.pfe.backend.JwtResponce;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenRefreshRequest {

    private String refreshToken;

}