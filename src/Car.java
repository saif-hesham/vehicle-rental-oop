public class Car extends Vehicle{
    private final String fuelType;

    public Car(int registrationNum, String brand, String year, String fuelType) {
        super(registrationNum, brand, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public int calculateRentalCost(int rentalPeriod) {
        return rentalPeriod * 4;
    }
}
