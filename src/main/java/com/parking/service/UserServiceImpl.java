package com.parking.service;

import com.parking.model.User;
import com.parking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {

        return userRepository.findAll();
    }

    @Override
    public Set<User> getUsersWithCars() {

        return userRepository.findUsersByCarsIsNotNull();
    }

    @Override
    public List<User> getUsersWithoutCars() {

        return userRepository.findUsersByCarsIsNull();
    }
}
