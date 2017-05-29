package ro.sci.carrental.repository;

import ro.sci.carrental.model.Cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roronoa on 5/18/2017.
 */
public class CarRepository {

    List<Cars> cars=new ArrayList<Cars>();
    public void addCar(Cars car) {
        cars.add(car);
    }
    public List<Cars> getCars() {
        return cars;
    }
}
