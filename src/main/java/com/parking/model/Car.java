package com.parking.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
//import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer car_id;

    private String model;

    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User owner;

    public Car(String carModel, String number) {
        this.model = carModel;
        this.number = number;
    }

    public Car() {
    }

    public Integer getCar_id() {
        return car_id;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public User getOwner() {
        return owner;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!getCar_id().equals(car.getCar_id())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getNumber().equals(car.getNumber())) return false;
        return getOwner().equals(car.getOwner());
    }

    @Override
    public int hashCode() {
        int result = getCar_id().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getNumber().hashCode();
        return result;
    }
}
