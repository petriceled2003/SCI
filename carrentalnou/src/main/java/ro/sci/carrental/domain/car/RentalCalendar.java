package ro.sci.carrental.domain.car;


import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;


public class RentalCalendar {


    /**
     * Public method pickupTime() simulates a car pickup by a client
     * @param car the object car in use
     * @param customer the customer
     * @param date date and time of pickup
     */
    public void pickupTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " " + car.getModel()+ " va fi ridicat de clientul " +
                customer.getFirstName() + " " + customer.getLastName() + " la data si ora " + date);

    }

    /**
     * Public method returnTime() simulates a return of a car previously picked up
     * @param car object of car in use
     * @param customer the custumer
     * @param date date and time of return
     */
    public void returnTime(Car car, Customer customer, String date) {
        System.out.println("Automobilul " + car.getMake() + " " + car.getModel()+ " va fi inapoiat de clientul " +
                customer.getFirstName() + " " + customer.getLastName() + " la data si ora " + date);
    }
}