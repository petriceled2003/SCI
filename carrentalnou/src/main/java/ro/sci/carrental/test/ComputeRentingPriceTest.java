package ro.sci.carrental.test;

import org.junit.Test;
import ro.sci.carrental.service.ComputeRentingPrice;

import static org.junit.Assert.*;

/**
 * Created by Roronoa on 7/13/2017.
 */
public class ComputeRentingPriceTest {

      ComputeRentingPrice p1=new ComputeRentingPrice(5,10);
    @Test
    public void calculatePrice() throws Exception {

double res = p1.calculatePrice(5,10);

assertEquals(res,50, 0.000000000001d);

    }


    @Test
    public void calculatePrice2() throws Exception {

        double res = p1.calculatePrice(1,0);

        assertEquals(res,0, 0.000000000001d);

    }

}