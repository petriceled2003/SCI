package ro.sci.carrental.service;

import ro.sci.carrental.model.Cars;
import ro.sci.carrental.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roronoa on 5/18/2017.
 */
public class SearchService {

    CarRepository carRepository;
    public List<Cars> findCarsByMake(String make) {
        List<Cars> foundCars = new ArrayList<Cars>();

        for (Cars car : carRepository.getCars()) {
            if (car.getMake().equals(make)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }


}
