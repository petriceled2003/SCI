package ro.sci.carrental.domain.customer;

import java.sql.Struct;

/**
 * Created by Roronoa on 5/29/2017.
 * Address class cu informatiile despre un customer
 */
public class Address {

    private String city;
    private String street;
    private String number;



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }




}
