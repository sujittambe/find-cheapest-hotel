
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarRentalTest {

    @Test
    public void findCheapestCarRental() {
        CarRental hertz = new CarRental(50, "Hertz");
        CarRental avis = new CarRental(70, "Avis");
        CarRental enterprise = new CarRental(60, "Enterprise");

        List<CarRental> rentalList = new ArrayList<>();
        rentalList.add(avis);
        rentalList.add(hertz);
        rentalList.add(enterprise);

        CarRentalSystem carRentalSystem = new CarRentalSystem(rentalList);
        CarRental cheapestRental = carRentalSystem.findCheapestRental();

        assertEquals(hertz, cheapestRental);
    }
}
