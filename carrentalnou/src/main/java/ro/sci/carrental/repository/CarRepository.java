package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

import java.util.List;

/**
 * Created by Roronoa on 5/25/2017.
 */
public interface CarRepository {

    /**
     * get all cars in the system
     *
     * @return List<Car></>
     */
    List<Car> getAll();

    /**
     * Return all the cars of a certain maker
     *
     * @param make
     * @return
     */

    List<Car> getCarsByMake(String make);

    /**
     * Return all cars by fuel type
     *
     * @param fuelType
     * @return
     */

    List<Car> getCarsByFuelType(FuelType fuelType);

    /**
     * adds a car in the system
     *
     * @param car
     */
    void add(Car car);

    /**
     * removes a car from the system
     *
     * @param car
     */
    void delete(Car car);

    /**
     * @param car
     */
    void update(Car car);

}
