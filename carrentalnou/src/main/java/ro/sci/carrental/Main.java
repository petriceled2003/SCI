package ro.sci.carrental;

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

    // private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // initializam masini


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
                System.out.println(car);
            } catch (InvalidEntityException e) {

                System.out.println("invalid car for: [" + line + "] at line: " + i);
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
                System.out.println(customer);
            } catch (InvalidEntityException e) {

                System.out.println("invalid line at line: " + j);
            }

        }

//        Car mercedes = new Car();
//        Car bmw = new Car();
//        Car vw = new Car();
//
//        CarRepositoryImpl carRepository = new CarRepositoryImpl();
//
//        //introducem masini
//        carRepository.add(mercedes);
//        carRepository.add(bmw);
//        carRepository.add(vw);
//
//        //initializam clienti
//        Address adress = new Address();
//        Customer customer1 = new Customer();
//        customer1.setAdresa(adress);
//        Customer customer2 = new Customer();
//        Address adress2 = new Address();
//        customer2.setAdresa(adress2);
//
//        //efectuam cautari
//        searches(carRepository);

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
