import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRentalHistory(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }
}
