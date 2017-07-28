package ro.sci.carrental.writer;

import ro.sci.carrental.domain.car.Car;
import ro.sci.carrental.domain.customer.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EntityWriter {

    public static void writeCarToCsv(File file, Car car) throws IOException {
        Charset charset = Charset.forName("UTF8");
        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset,StandardOpenOption.CREATE,StandardOpenOption.APPEND)) {
            writer.write(car.toString()+"\n");
        }
    }


    public static void writeCustomerToCsv(File file, Customer customer) throws IOException {
        Charset charset = Charset.forName("UTF8");
        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset,StandardOpenOption.CREATE,StandardOpenOption.APPEND)) {
            writer.append(customer.toString()+"\n");
        }
    }
//    public static void writeCarToCsv(File file, List<Car> cars) throws IOException {
//        Charset charset = Charset.forName("UTF8");
//        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath(), charset)) {
//            writer.append(cars.toString());
//
//        }
//    }


    public static void writeCarToCsv(String filePath,Car car) throws IOException {

        EntityWriter.writeCarToCsv(new File(filePath), car);

    }
}
