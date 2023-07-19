package org.example;

public class Boat extends Vehicle {

    private float speed;

    private int capacity;

    public Boat (float speed, int capacity, boolean repairNeeded) {
        super(repairNeeded, 5000);
        this.speed = speed;
        this.capacity = capacity;
    }
}
