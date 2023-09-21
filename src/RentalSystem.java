import java.util.ArrayList;

public class RentalSystem {
    private int curRevenue = 0;
    private final ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
    private final ArrayList<Vehicle> availableVehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }
    public void rentVehicle(int registrationNumber, int rentalPeriod) {

        Vehicle myVehicle = null;
        for(Vehicle vehicle: availableVehicles) {
            if(registrationNumber == vehicle.getRegistrationNum()){
                myVehicle = vehicle;

                int rentalCost = vehicle.calculateRentalCost(rentalPeriod);
                curRevenue += rentalCost;
                if(vehicle instanceof  Car) {
                    System.out.print(((Car) vehicle).getFuelType()+"\n");
                } else if (vehicle instanceof  Motorcycle) {
                    System.out.print(((Motorcycle) vehicle).getEngineCapacity() +"\n");
                }
            }

        }

            if(myVehicle != null) {
                rentedVehicles.add(myVehicle);
                availableVehicles.remove(myVehicle);
            } else {
                System.out.print("This vehicle is not available");
            }

        }


    public void returnVehicle(int registrationNumber) {
        Vehicle myVehicle = null;
        for(Vehicle vehicle: rentedVehicles) {
            if(registrationNumber == vehicle.getRegistrationNum()){
                myVehicle = vehicle;


            }
        }
        if(myVehicle != null) {
            availableVehicles.add(myVehicle);
            rentedVehicles.remove(myVehicle);
        } else {
            System.out.print("This vehicle is not rented");
        }
    }

    public int getTotalRevnue() {
        return curRevenue;
    }
}

