package com.company;

import java.util.List;

public class Person {
    private int Age;
    private String firstNaeme;
    private String lastName;
    private List<Car> cars;

    public Person(int age, String firstNaeme, String lastName, List<Car> cars) {
        Age = age;
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

    public Person(int age, String firstNaeme, String lastName) {
        Age = age;
        this.firstNaeme = firstNaeme;
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
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
