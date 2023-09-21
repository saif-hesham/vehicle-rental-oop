public abstract class Vehicle {
    private final int registrationNum;

    private final String brand;

    private final String year;

    public Vehicle(int registrationNum, String brand, String year) {
        this.registrationNum = registrationNum;
        this.brand = brand;
        this.year = year;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public abstract int calculateRentalCost(int rentalPeriod);
}
