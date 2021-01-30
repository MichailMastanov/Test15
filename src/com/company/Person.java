package com.company;

import java.util.List;

public class Person {
    private int vozrast;
    private String firstNaeme;
    private String lastName;
    private List<Car> cars;

    public Person(int vozrast, String firstNaeme, String lastName, List<Car> cars) {
        this.vozrast = vozrast;
        this.firstNaeme = firstNaeme;
        this.lastName = lastName;
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Person(int vozrast, String firstNaeme, String lastName) {
        this.vozrast = vozrast;
        this.firstNaeme = firstNaeme;
        this.lastName = lastName;
    }

    public int getvozrast() {
        return vozrast;
    }

    public void setvozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public String getFirstNaeme() {
        return firstNaeme;
    }

    public void setFirstNaeme(String firstNaeme) {
        this.firstNaeme = firstNaeme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
