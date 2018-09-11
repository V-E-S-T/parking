package com.parking.service;

import com.parking.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    List<User> getAll();

    Set<User> getUsersWithCars();

    List<User> getUsersWithoutCars();

}
