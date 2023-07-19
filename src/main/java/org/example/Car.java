package org.example;

public class Car extends Vehicle {

    private float speed;

    private int wheels;

    private String fuel;


    public Car (float speed, int wheels, String fuel, boolean repairNeeded) {
        super(repairNeeded, 1000);
        this.speed = speed;
        this.wheels = wheels;
        this.fuel = fuel;
    }

}
