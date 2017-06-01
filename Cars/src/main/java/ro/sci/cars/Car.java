package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by Roronoa on 5/11/2017.
 */
public class Car implements Vehicle {
    private int fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;


    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {

        this.availableFuel = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.factoryAvgConsumptionPer100km = avgConsumption;

    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void drive(int gear, double km) {
        //  System.out.println("drive" + km);
        /**
         *
         * calculeaza cat s-a consumat in functie de nr de km si treapta de viteza curenta
         * case currentGear==1
         * calculateFuel(1,km) am mai adaugat aceste cuvinte pentru a testa
         *
         */

        int avgComVit1 = 12;
        int avgComVit2 = 11;
        int avgComVit3 = 10;
        int avgComVit4 = 9;
        int avgComVit5 = 8;
        int avgComVit6 = 7;

        double numarLitriConsumati = 0;

        switch (gear) {
            case 1: {
                numarLitriConsumati = (avgComVit1 * km) / 100;
                System.out.printf("Numarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);

                break;
            }
            case 2: {
                numarLitriConsumati = (avgComVit2 * km) / 100;
                System.out.printf("\nNumarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);
                break;
            }
            case 3: {
                numarLitriConsumati = (avgComVit3 * km) / 100;
                System.out.printf("\nNumarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);
                break;
            }
            case 4: {
                numarLitriConsumati = (avgComVit4 * km) / 100;
                System.out.printf("\nNumarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);
                break;
            }
            case 5: {
                numarLitriConsumati = (avgComVit5 * km) / 100;
                System.out.printf("\nNumarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);
                break;
            }
            case 6: {
                numarLitriConsumati = (avgComVit6 * km) / 100;
                System.out.printf("\nNumarul de litri consumati, pt %s km, in vit %s este %s litri", km, gear, numarLitriConsumati);
                break;
            }

        }

    }

    public void shiftGear(int gear) {
        System.out.println("Shift Gear" + gear);
        this.currentGear = gear;
    }

    public double getAvailableFuel() {
        return this.availableFuel;
    }

    public double getAvgFueler100km() {
        return this.driveAvgConsumptionPer100km;
    }

    public FuelType getFuelType() {
        return this.fuelType;

    }
}
