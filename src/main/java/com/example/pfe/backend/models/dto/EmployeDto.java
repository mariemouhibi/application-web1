package com.example.pfe.backend.models.dto;

public class EmployeDto {


    private Long idemploye;
    private String name;
    private String Email;
    private String Password;

    public EmployeDto(Long idemploye, String name, String email, String password) {
        this.idemploye = idemploye;
        this.name = name;
        Email = email;
        Password = password;
    }

    public Long getIdemploye() {
        return idemploye;
    }

    public void setIdemploye(Long idemploye) {
        this.idemploye = idemploye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "EmployeDto{" +
                "idemploye=" + idemploye +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
