package org.example;

import java.util.ArrayList;

public class Garage {
    public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public static String billCalc(int ID) {
        for (Vehicle v: vehicleList) {
            if (v.getVehID() == ID) {
                if (v.repairNeeded) {
                    v.repairVehicle();
                    return String.format("Vehicle repaired!\n Bill for %s with ID %d = %d", v.getVehType(), ID, v.bill );
                }
            }
        } return "Vehicle with ID " + ID + " doesn't need repairing!";
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

    public static StringBuilder getVehicleList() {
        StringBuilder toReturn = new StringBuilder();
        for (Vehicle v: vehicleList) {
            toReturn.append(v);
        }
        return toReturn;
    }

    public static void removeVehicleByType(String c) {
        ArrayList<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle v: vehicleList) {
            if (v.getVehType() == c) {
                toRemove.add(v);
            }
        }
        vehicleList.removeAll(toRemove);
        System.out.println("Removed all " + c + "s!");
    }

    public static void emptyVehicleList() {
        vehicleList.clear();
        System.out.println("Emptied garage of vehicles!");
    }
}
