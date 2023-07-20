package org.example;

public class Menu {
    public static void startMenu() {
        String homeScreen = """
                ==========================================================
                Welcome to the Garage Homepage, please select your operation:
                ==========================================================
                1. List all vehicles
                2. Find a vehicle by ID
                3. Record a vehicle repair and bill
                4. Remove a vehicle from the garage
                5. Empty the garage of vehicles
                6. Exit
                """;
        System.out.println(homeScreen);
        String userInput = Utility.inputScanString();

        switch (userInput) {
            case "1" -> System.out.println(Garage.getVehicleList());
            case "2" -> findVehicleByID();
            case "3" -> repairVehicle();
            case "4" -> System.out.println("not done this yet either");
            case "5" -> Garage.emptyVehicleList();
            case "6" -> System.out.println("Exiting...");
        }

    }

    public static void findVehicleByID() {
        String firstScreen = """
                ==========================================================
                Please enter the ID of a vehicle to find from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen);
        int userInput = Utility.inputScanInt();
        Garage.getVehicleByID(userInput);

    }

    public static void repairVehicle() {
        String firstScreen = """
                ==========================================================
                Please enter the ID of a vehicle to repair and bill from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen + Garage.getVehicleList());
        int userInput = Utility.inputScanInt();
        Garage.billCalc(userInput);
    }
}
