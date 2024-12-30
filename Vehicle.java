import java.util.*;

// Abstraction: Abstract class Vehicle
abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        if (vehicleId == null || vehicleId.isEmpty() || model == null || model.isEmpty() || baseRentalRate <= 0) {
            throw new IllegalArgumentException("Invalid vehicle details provided.");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }

    // Encapsulation: Getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Abstract methods for rental calculation and availability
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return String.format("Vehicle ID: %s, Model: %s, Base Rate: %.2f, Available: %s", vehicleId, model, baseRentalRate, isAvailable);
    }
}
