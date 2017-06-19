package ro.sci.carrental;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Address;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarSearchServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // initializam masini
        Car mercedes = new Car();
        Car bmw = new Car();
        Car vw = new Car();

        CarRepositoryImpl carRepository = new CarRepositoryImpl();

        //introducem masini
        carRepository.add(mercedes);
        carRepository.add(bmw);
        carRepository.add(vw);


        //initializam clienti
        Address adress = new Address();
        Customer customer1 = new Customer();
        customer1.setAdresa(adress);
        Customer customer2 = new Customer();
        Address adress2 = new Address();
        customer2.setAdresa(adress2);

        //efectuam cautari
        searches(carRepository);


    }

    /**
     * Public static void method searches() runs multiple searches criteria
     *
     * @param carRepository holds the values of car list.
     */
    private static void searches(CarRepositoryImpl carRepository) {
        //cautarea tuturor masinilor
        System.out.println("Lista masinilor din CarRepositoryImpl este: ");
        for (Car car : carRepository.getAll()) {
            System.out.println(car.getMake());
        }


        //cautare dupa marca
        CarSearchServiceImpl search1 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMake = search1.findCarsByMake("BMW");

        System.out.println("Cautarea dupa Marca returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMake) {
            System.out.println(car.getMake() + " " + car.getModel());
        }


        //cautare dupa marca si model
        CarSearchServiceImpl search2 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("Mercedes", "e220d");

        System.out.println("Cautarea dupa Marca si Model returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMakeAndModel) {
            System.out.println(car.getMake() + " " + car.getModel());
        }


        //cautare dupa Marca, Model, Culoare si Locuri
        CarSearchServiceImpl search3 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMultipleCategories = search3.findCarsByMultipleCategories(
                "Volkswagen", "Passat", "White", 5);

        System.out.println("Cautarea dupa Marca, Model, Culoare si Locuri returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMultipleCategories) {
            System.out.println(car.getMake() + " " + car.getModel());
        }

    }
}
