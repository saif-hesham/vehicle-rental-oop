public class Bike extends Vehicle{
    private String fuelType;
    public Bike(int registrationNum, String brand, String year) {
        super(registrationNum, brand, year);
    }

    @Override
    public int calculateRentalCost(int rentalPeriod) {
        return rentalPeriod * 2;
    }
}
