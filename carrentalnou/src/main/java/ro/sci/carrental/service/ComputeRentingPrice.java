package ro.sci.carrental.service;

/**
 * Created by Roronoa on 7/9/2017.
 */
public class ComputeRentingPrice {
    private int numberOfDays;
    private int priceOfTheCar;

    public ComputeRentingPrice(int numberOfDays, int priceOfTheCar) {
        this.numberOfDays = numberOfDays;
        this.priceOfTheCar = priceOfTheCar;
    }

    public double calculatePrice(int numberOfDays, int priceOfTheCar){
        double price;
        price=numberOfDays*priceOfTheCar;
        return  price;
    }
}
