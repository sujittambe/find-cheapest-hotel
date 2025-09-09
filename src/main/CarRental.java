
import java.util.Objects;

public class CarRental {
    private final double rate;
    private final String name;

    public CarRental(double rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarRental)) return false;
        CarRental rental = (CarRental) o;
        return Double.compare(rental.getRate(), getRate()) == 0 &&
                Objects.equals(name, rental.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRate(), name);
    }
}

