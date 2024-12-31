public class Truck extends Vehicle implements Rentable {
    private boolean hasCargoSpace;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean hasCargoSpace) {
        super(vehicleId, model, baseRentalRate);
        this.hasCargoSpace = hasCargoSpace;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cargoCharge = hasCargoSpace ? 50.0 : 0.0;
        return getBaseRentalRate() * days + cargoCharge;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Truck rented for " + days + " days.");
        } else {
            System.out.println("Truck is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned.");
    }
}
