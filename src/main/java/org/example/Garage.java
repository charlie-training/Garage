package org.example;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public static void billCalc(int ID) {
        for (Vehicle v: vehicleList) {
            if (v.getVehID() == ID) {
                if (v.repairNeeded) {
                    System.out.println("Vehicle repaired!\n Bill for " + v + " = " + v.bill);
                    v.repairVehicle();
                }
            }
        }
    }

    public static void vehicleListAdd(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public static void getVehicleByID(int ID) {
        for (Vehicle v: vehicleList) {
            if (v.getVehID() == ID) {
                System.out.println(v);
            }
        }
    }


    public static void removeVehicleByID(int ID) {
        ArrayList<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle v: vehicleList) {
            if (v.getVehID() == ID) {
                toRemove.add(v);
            }
        }
        vehicleList.removeAll(toRemove);
        System.out.println("Removed vehicle with ID: " + ID);
    }

    public static ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public static void removeVehicleByType(Class c) {
        ArrayList<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle v: vehicleList) {
            if (v.getClass() == c) {
                toRemove.add(v);
            }
        }
        vehicleList.removeAll(toRemove);
        System.out.println("Removed all " + c + "'s!");
    }

    public static void emptyVehicleList() {
        removeVehicleByType(Vehicle.class);
        System.out.println("Emptied list of vehicles!");
    }
}
