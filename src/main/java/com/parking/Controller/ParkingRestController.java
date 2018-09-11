package com.parking.Controller;

import com.parking.model.Car;
import com.parking.model.User;
import com.parking.service.CarService;
import com.parking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ParkingRestController {

    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @RequestMapping("/users/all")
    public List<User> getAll(){

        return userService.getAll();
    }

    @RequestMapping("/users/with_cars")
    public List<User> getUsersWithCars(){

        return userService.getUsersWithCars();
    }

    @RequestMapping("/users/without_cars")
    public List<User> getUsersWithoutCars(){

        return userService.getUsersWithoutCars();
    }

    @RequestMapping("/cars/all")
    public List<Car> getAllCars(){

        return carService.getAll();
    }

}
