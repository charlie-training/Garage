package org.example;
/**
 * Vehicle is an abstract class that is never instantiated, and instead defines some common
 * attributes and methods for each of the car/boat/plane objects
 */
public abstract class Vehicle implements VehicleSpec {

    public boolean repairNeeded;
    public int bill;
    private final int vehID;

    public String vehType;

    public Vehicle(boolean repairNeeded, int bill) {
        this.repairNeeded = repairNeeded;
        this.bill = bill;
        Garage.vehicleListAdd(this);
        this.vehID = Utility.vehIDGen();;
    }

    public void repairVehicle() {
        this.repairNeeded = false;
    }

    public int getVehID() {
        return vehID;
    }

    public String getVehType() {
        return vehType;
    }

    @Override
    public String toString() {
        return String.format("Type: %s | ID %d\n", this.getClass().getSimpleName(), this.getVehID());
    }
}
