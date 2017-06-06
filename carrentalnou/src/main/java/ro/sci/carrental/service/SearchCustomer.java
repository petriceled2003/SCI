package ro.sci.carrental.service;

import ro.sci.carrental.domain.Customer;

import java.util.List;

/**
 * Created by Roronoa on 6/6/2017.
 */
public interface SearchCustomer {
    List<Customer> findCustomerByName(String name);

    List<Customer> findCustomerByNameAndCity(String name, String city);

    List<Customer> findCustomerByMultipleCategories(String name, String citty  , String street, int number);
}

