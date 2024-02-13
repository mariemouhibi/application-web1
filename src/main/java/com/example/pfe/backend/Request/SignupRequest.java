package com.example.pfe.backend.Request;

import com.example.pfe.backend.models.ERole;
import lombok.*;
import java.util.Date;

@Data
@Setter
@Getter
public class SignupRequest {
    private Long idsignup;
    private String username;
    private String email;
    private Date dateofbirth;
    private String phone;
    private String password;
    private ERole role;


}
