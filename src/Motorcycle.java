public class Motorcycle extends Vehicle{
    private final String engineCapacity;
    public Motorcycle(int registrationNum, String brand, String year, String engineCapacity) {
        super(registrationNum, brand, year);
        this.engineCapacity = engineCapacity;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int calculateRentalCost(int rentalPeriod) {
        return rentalPeriod * 3;
    }
}
