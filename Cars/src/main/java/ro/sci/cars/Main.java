package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by Roronoa on 5/11/2017.
 */
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(10, FuelType.DIESEL,60,6,7);
        System.out.println("Simulating a car drive:");
        simulateDriving(car);
        Vehicle horse= new Horse();
//        System.out.println("Simulating a horse drive:");
//        simulateDriving(horse);
    }

    private static void simulateDriving(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
       // vehicle.shiftGear(1);
        vehicle.drive(1,1);
      //  vehicle.shiftGear(2);
        vehicle.drive(2,0.1);
      //  vehicle.shiftGear(3);
        vehicle.drive(3,0.2);
       // vehicle.shiftGear(4);
        vehicle.drive(4,0.5);
      //  vehicle.shiftGear(5);
        vehicle.drive(5,11.5);
        vehicle.drive(6,35.5);
       //vehicle.shiftGear(1);
      //  vehicle.stop();

//        double availableFuel=vehicle.getAvailableFuel();
//        System.out.println("available Fuel "+ availableFuel);
//
//        double avgFuelPer100km=vehicle.getAvgFueler100km();
//        System.out.println("average fuel "+ avgFuelPer100km);
    }
}
