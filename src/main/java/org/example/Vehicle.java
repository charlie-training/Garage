package org.example;

public abstract class Vehicle implements VehicleSpec {

    public boolean repairNeeded;
    public float bill;
    private final int vehID;

    public Vehicle(boolean repairNeeded, float bill) {
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

    @Override
    public String toString() {
        return String.format("Type: %s | ID %d\n", this.getClass().toString(), this.getVehID());
    }
}
