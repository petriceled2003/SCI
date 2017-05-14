package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by Roronoa on 5/11/2017.
 */
public interface Vehicle {

    /**
     *   Starts a vehicle
     */
    void start();

    /**
     *  stops a vehicle
     */
    void stop();

    /**
     * Drive a vehicle for a specified numebr of km
     * Param km the number of km to drive
     */
    void drive(int gear,double km);

    /**
     * Shift the car gear with the specified number
     *
     * @param gear
     */
    void shiftGear(int gear);

    /**
     * Finds the available fuel level in the car tank
     *
     * @return double value representing the remaining fuel in the car tank
     */
    double getAvailableFuel();

    /**
     * Get the avg consumption per 100 km
     *
     * @return double value represnting the avg consumption per 100 km
     */
    double getAvgFueler100km();

    /**
     * Gets the fuel of the current vehicle
     * @return FueltType of the current vehicle
     */
    FuelType getFuelType();
}
