package org.example;

public class Boat extends Vehicle {

    private float speed;

    private int capacity;

    public Boat (float speed, int capacity, boolean repairNeeded) {
        super(repairNeeded, 5000);
        this.speed = speed;
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return String.format("This is a boat with name %s and ID %d\n", this.getClass(), this.getVehID());
    }
}
