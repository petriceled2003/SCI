package ro.sci.carrental;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;
import ro.sci.carrental.reader.CarConvertor;
import ro.sci.carrental.reader.CustomerConvertor;
import ro.sci.carrental.reader.EntityReader;
import ro.sci.carrental.reader.InvalidEntityException;
import ro.sci.carrental.repository.CarRepositoryImpl;
import ro.sci.carrental.service.CarSearchServiceImpl;

import java.io.File;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // initializam masini

        LOGGER.info("ONE PIECE - BEGININNG");
        File file = new File("cars.txt");
        EntityReader ent = new EntityReader();
        List<String> lines = ent.readLines(file);
        CarConvertor carConvertor = new CarConvertor();
        int i = 0;
        for (String line : lines) {
            i++;
            Car car = null;
            try {
                car = carConvertor.convert(line);
                // System.out.println(car);
                LOGGER.info("info car " + car);
            } catch (InvalidEntityException e) {

                LOGGER.info("invalid car for: [" + line + "] at line: " + i);
            }
        }

//initializam Customers

        File fileInputCustomers = new File("customers.txt");
        EntityReader entCustomer = new EntityReader();
        List<String> linesCustomer = entCustomer.readLines(fileInputCustomers);
        CustomerConvertor customerConv = new CustomerConvertor();
        int j = 0;
        for (String line : linesCustomer) {
            j++;
            Customer customer = null;
            try {
                customer = customerConv.convert(line);
                //   System.out.println(customer);
                LOGGER.info("info customer " + customer);
            } catch (InvalidEntityException e) {

                LOGGER.info("invalid line at line: " + j);
            }

        }
        LOGGER.info("END OF THE MAP");
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
            //System.out.println(car.getMake());
            LOGGER.info(car.getMake());
        }

        //cautare dupa marca
        CarSearchServiceImpl search1 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMake = search1.findCarsByMake("BMW");

        System.out.println("Cautarea dupa Marca returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMake) {
            LOGGER.info(car.getMake() + " " + car.getModel());
        }

        //cautare dupa marca si model
        CarSearchServiceImpl search2 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMakeAndModel = search2.findCarsByMakeAndModel("Mercedes", "e220d");
        LOGGER.info("Cautarea dupa Marca si Model returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMakeAndModel) {
            LOGGER.info(car.getMake() + " " + car.getModel());
        }


        //cautare dupa Marca, Model, Culoare si Locuri
        CarSearchServiceImpl search3 = new CarSearchServiceImpl(carRepository);
        List<Car> foundCarsByMultipleCategories = search3.findCarsByMultipleCategories(
                "Volkswagen", "Passat", "White", 5);

        System.out.println("Cautarea dupa Marca, Model, Culoare si Locuri returneaza urmatoarele masini: ");
        for (Car car : foundCarsByMultipleCategories) {
            LOGGER.info(car.getMake() + " " + car.getModel());
        }

    }
}
