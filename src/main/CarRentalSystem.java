
import java.util.Comparator;
import java.util.List;

public class CarRentalSystem {
    private final List<CarRental> rentals;

    public CarRentalSystem(List<CarRental> rentals) {
        this.rentals = rentals;
    }

    public CarRental findCheapestRental() {
        return rentals.stream()
                .sorted(Comparator.comparingDouble(CarRental::getRate))
                .findFirst()
                .get();
    }
}
