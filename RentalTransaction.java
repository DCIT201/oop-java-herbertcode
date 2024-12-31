public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
    }

    public void executeTransaction() {
        vehicle.rent(customer, days);
    }
}
