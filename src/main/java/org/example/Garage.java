package org.example;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public static void billCalc(Vehicle vehicle) {
        for (Vehicle v: vehicleList) {
            if (v.repairNeeded) {
                System.out.println("Bill for " + v + " = " + v.bill);
            }
        }
    }

    public static void vehicleListAdd(Vehicle vehicle) {

        vehicleList.add(vehicle);
    }

    public static void vehicleListRemove(Vehicle vehicle) {

        vehicleList.remove(vehicle);
    }
}
