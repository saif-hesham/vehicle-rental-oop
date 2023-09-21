public class Main {
    public static void main(String[] args) {

        Vehicle mistubishi = new Car(23, "Lancer", "2019", "Diesel");
        Vehicle toyota = new Car(11, "Corolla", "2023", "Gasoline");

        Vehicle yamaha = new Motorcycle(99, "New", "2022", "1600");
        Vehicle motorolla = new Motorcycle(77, "Fire", "2021", "1600");

        Vehicle myBike = new Bike(1001, "Road", "2016");

        RentalSystem rentalSystem = new RentalSystem();

        rentalSystem.addVehicle(mistubishi);
        rentalSystem.addVehicle(toyota);
        rentalSystem.addVehicle(yamaha);
        rentalSystem.addVehicle(motorolla);
        rentalSystem.addVehicle(myBike);


        //Renting
        rentalSystem.rentVehicle(23, 2);
        rentalSystem.rentVehicle(99, 2);
        rentalSystem.rentVehicle(1001, 2);

        //Returning
        rentalSystem.returnVehicle(23);

        //Total Revenue
       System.out.print( rentalSystem.getTotalRevnue());



    }
}