package org.example;

public abstract class Vehicle implements VehicleSpec {

    public boolean repairNeeded;
    public float bill;

    public Vehicle (boolean repairNeeded, float bill) {
        this.repairNeeded = repairNeeded;
        this.bill = bill;
        Garage.vehicleListAdd(this);
    }

    public void repairVehicle() {
        this.repairNeeded = false;
    }

}
