package org.example;
/**
 * Main simply instantiates a few objects and calls the startMenu() method from Menu to begin the application.
 */
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(140, 4, "diesel",false);
        Plane plane1 = new Plane(400, 100000, 90, 35000, false);
        Boat boat1 = new Boat(25, 30, true);
        Plane plane2 = new Plane(400, 100000, 90, 35000, false);

        Menu.startMenu();
    }

}