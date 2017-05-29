package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Car;
import ro.sci.carrental.util.FuelType;

import java.util.ArrayList;
import java.util.List;


public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<Car>();

    public List<Car> getCarsByMake(String make) {
        return null;
    }

    public List<Car> getCarsByFuelType(FuelType fuelType) {
        return null;
    }


    public List<Car> getAll() {
        return cars;
    }


    public void add(Car car) {
        cars.add(car);
    }

    public void delete(Car car) {

    }

    public void update(Car car) {

    }
}
