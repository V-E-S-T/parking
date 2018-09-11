package com.parking.repository;

import com.parking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Integer>{

    Set<User> findUsersByCarsIsNotNull();
    List<User> findUsersByCarsIsNull();
}
