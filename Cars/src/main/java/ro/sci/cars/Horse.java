package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by Roronoa on 5/11/2017.
 */
public class Horse implements Vehicle {



    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(int gear,double km) {
        System.out.println("drive");
    }

    public void shiftGear(int gear) {
        System.out.println("Shift Gear");
    }

    public double getAvailableFuel() {
        return 0;
    }

    public double getAvgFueler100km() {
        return 0;
    }



    public FuelType getFuelType() {
        return FuelType.OVAZ;
    }
}
