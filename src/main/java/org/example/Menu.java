package org.example;
/**
 * This class is called directly from main and forms the basis of the flow of the application.
 * The options are printed for the user and the switch statement calls any of the correspinding functions
 */
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
                5. Remove a vehicle by its type
                6. Empty the garage of vehicles
                7. Exit
                """;
        System.out.println(homeScreen);
        String userInput = Utility.inputScanString();

        switch (userInput) {
            case "1" -> {System.out.println(Garage.getVehicleList()); startMenu();}
            case "2" -> findVehicleByID();
            case "3" -> repairVehicle();
            case "4" -> removeVehicle();
            case "5" -> removeByType();
            case "6" -> {Garage.emptyVehicleList();startMenu();}
            case "7" -> System.out.println("Exiting...");
        }

    }
    // Option number 2
    public static void findVehicleByID() {
        String firstScreen = """
                ==========================================================
                Please enter the ID of a vehicle to find from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen);
        int userInput = Utility.inputScanInt();
        System.out.println(Garage.getVehicleByID(userInput));
        startMenu();

    }
    // Option Number 3
    public static void repairVehicle() {
        String firstScreen = """
                ==========================================================
                Please enter the ID of a vehicle to repair and bill from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen + Garage.getVehicleList());
        int userInput = Utility.inputScanInt();
        System.out.println(Garage.billCalc(userInput));
        startMenu();
    }

    public static void removeVehicle() {
        String firstScreen = """
                ==========================================================
                Please enter the ID of a vehicle to remove from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen + Garage.getVehicleList());
        int userInput = Utility.inputScanInt();
        System.out.println(Garage.removeVehicleByID(userInput));
        startMenu();
    }

    public static void removeByType() {
        String firstScreen = """
                ==========================================================
                Please enter the type of a vehicle to remove all of that type from the Garage:
                ==========================================================
                """;
        System.out.println(firstScreen + Garage.getVehicleList());
        String userInput = Utility.inputScanString();
        Garage.removeVehicleByType(userInput);
        startMenu();
    }
}
