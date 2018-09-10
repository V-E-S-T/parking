package com.parking.repository;

import com.parking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{

    List<User> findUsersByCarListingIsNotNull();
    List<User> findUsersByCarListingIsNull();
}
