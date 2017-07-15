package ro.sci.carrental.reader;

import ro.sci.carrental.domain.customer.Customer;

import javax.xml.stream.events.EntityDeclaration;

/**
 * Created by Roronoa on 7/13/2017.
 */
public class CustomerConvertor implements Convertor<Customer> {

    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split(",");
        if (tokens.length != 4) {
            throw new InvalidEntityException("Invalid Customer Description");
        }
        Customer customer = new Customer();
        customer.setFirstName(tokens[0]);
        customer.setLastName(tokens[1]);
        //customer.setAdresa(tokens[2]);
        customer.setStreetAddress(tokens[2]);
        customer.setCity(tokens[3]);
        return customer;
    }
}
