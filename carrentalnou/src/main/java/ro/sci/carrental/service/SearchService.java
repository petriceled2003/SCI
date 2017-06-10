package ro.sci.carrental.service;

import ro.sci.carrental.domain.car.Car;

import java.util.List;

/**
 * Created by Roronoa on 5/25/2017.
 */
public interface SearchService {

    List<Car> findCarsByMake(String make);

    List<Car> findCarsByMakeAndModel(String make, String model);

    List<Car> findCarsByMultipleCategories(String make, String model, String color, int seats);
}
