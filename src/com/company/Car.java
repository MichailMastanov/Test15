package com.company;

public class Car {
    private int yar;
    private  String color;

    public int getYar() {
        return yar;
    }

    public void setYar(int yar) {
        this.yar = yar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int yar, String color) {
        this.yar = yar;
        this.color = color;
    }
}
