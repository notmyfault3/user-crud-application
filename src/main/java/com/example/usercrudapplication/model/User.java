package com.example.usercrudapplication.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "First Name should not be blank")
    @Size(min = 2, message = "First Name should be higher or equal to 2 characters")
    private String firstName;

    @NotBlank(message = "Last Name should not be blank")
    @Size(min = 2, message = "Last Name should be higher or equal to 2 characters")
    private String lastName;

    @Email(message = "Email is not valid")
    private String email;
}
