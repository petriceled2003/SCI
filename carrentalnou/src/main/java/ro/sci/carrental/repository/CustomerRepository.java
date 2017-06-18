package ro.sci.carrental.repository;

import ro.sci.carrental.domain.customer.Customer;

import java.util.List;

/**
 * Created by One Piece on 6/18/2017.
 */
public interface CustomerRepository {
    /**
     * returneaza clientii dupa nume
     * @param name
     * @return
     */

    List<Customer> getCustomersByLastName(String name);

    /**
     * returneaza clientii dupa nume si prenume
     * @param lastName
     * @param firstName
     * @return
     */

    List<Customer> getCustomersByLastNameAndFirstName(String lastName,String firstName);

    /**
     * adds a customer in the system
     *
     * @param customer
     */
    void add(Customer customer);

    /**
     * removes a customer from the system
     *
     * @param customer
     */
    void delete(Customer customer);

    /**
     * @param customer
     */
    void update(Customer customer);

}

