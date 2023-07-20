package org.example;

public class Plane extends Vehicle {

    private float speed;

    private float weight;

    private int capacity;

    private float maxAltitude;


    public Plane(float speed, float weight, int capacity, float maxAltitude, boolean repairNeeded) {
        super(repairNeeded, 10000);
        this.speed = speed;
        this.weight = weight;
        this.capacity = capacity;
        this.maxAltitude = maxAltitude;

    }
    @Override
    public String toString() {
        return String.format("This is a plane with name %s and ID %d\n", this.getClass(), this.getVehID());
    }
}
