import org.example.Car;
import org.example.Vehicle;
import org.example.Garage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
    }
}
