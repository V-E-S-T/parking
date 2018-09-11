package com.parking.service;

import com.parking.model.Car;
import com.parking.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCerviceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAll() {

        return carRepository.findAll();
    }
}
