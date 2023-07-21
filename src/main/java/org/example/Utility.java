package org.example;
import java.util.Scanner;
/**
 * A utility class which allows both ID generation and user inputs for ints and strings
 */
public class Utility {
    static int currentID = 0;
    public static int vehIDGen () {
        currentID++;
        return currentID;
    }
    public static String inputScanString () {
        Scanner scan = new Scanner(System.in);
        return scan.next().trim();
    }
    public static int inputScanInt () {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
