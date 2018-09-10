package com.parking.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstname;

    private String lastname;

//    @Column(name = "email", nullable = false, unique = true)
//    @Email
//    @NotBlank
//    @Size(max = 100)
    private String email;

//    @Column(name = "password", nullable = false)
//    @NotBlank
//    @Size(min = 5, max = 10)
    private String password;

    @OneToMany()
    private List<Car> carListing;
}
