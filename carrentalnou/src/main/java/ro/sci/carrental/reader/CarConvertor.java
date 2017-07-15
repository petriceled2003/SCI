package ro.sci.carrental.reader;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.car.FuelType;

/**
 * Created by Roronoa on 7/13/2017.
 */
public class CarConvertor implements Convertor<Car> {
    @Override
    public Car convert(String convertedString) throws InvalidEntityException{
        String[] tokens = convertedString.split(",");
        if (tokens.length != 6) {
            throw new InvalidEntityException("Invalid Car Description");
        }

        Car car = new Car();
        car.setMake(tokens[0]);
        car.setModel(tokens[1]);
        car.setColor(tokens[2]);
        car.setEngine(tokens[3]);
        car.setDoors(Integer.valueOf(tokens[4]));
        car.setFuelType(FuelType.valueOf(tokens[5].toUpperCase()));
        return car;
    }

}
