package com.parking.service;

import com.parking.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    List<User> getUsersWithCars();

    List<User> getUsersWithoutCars();

}
