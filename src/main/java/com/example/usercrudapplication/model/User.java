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

    @Size(min = 2, message = "First Name should be higher or equal to 2 characters")
    private String firstName;

    @Size(min = 2, message = "Last Name should be higher or equal to 2 characters")
    private String lastName;

    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email is not valid")
    private String email;

}
