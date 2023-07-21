import org.example.Car;
import org.example.Boat;
import org.example.Plane;
import org.example.Garage;
import org.example.Main;
import org.example.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GarageTest {

    Car testcar = new Car(100, 4, "petrol", true);

    @BeforeAll
    public static void beforeTesting() {
        System.out.println("Beginning testing...");
    }
    @Test
    public void garageTests() {
        Assertions.assertNotNull(Garage.vehicleList);
        Assertions.assertEquals(Garage.billCalc(testcar.getVehID()), "Vehicle repaired!\n Bill for Car with ID 1 = 1000");
        Assertions.assertEquals(Garage.getVehicleList().toString(), "Type: Car | ID 1\n");
        Assertions.assertEquals(Garage.removeVehicleByID(1), "Removed vehicle with ID: 1");
        Garage.removeVehicleByType("Car");
        Assertions.assertEquals(Garage.vehicleList, new ArrayList< Vehicle >());
        Car testcar2 = new Car(120, 3, "Electric", false);
        Boat testboat = new Boat(45, 10, true);
        Plane testplane = new Plane(500, 50000, 124, 30000, false);
        Garage.emptyVehicleList();
        Assertions.assertEquals(Garage.vehicleList, new ArrayList< Vehicle >());
        Plane testplane2 = new Plane(500, 50000, 124, 30000, false);
        Assertions.assertEquals(Garage.billCalc(testcar.getVehID()), "Vehicle with ID 1 doesn't need repairing!");
        Assertions.assertEquals(Garage.getVehicleByID(5), testplane2);
    }
}
