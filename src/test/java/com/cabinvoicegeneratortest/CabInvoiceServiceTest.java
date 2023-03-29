package com.cabinvoicegeneratortest;

import com.cabinvoicegenerator.CabInvoiceService;
import com.cabinvoicegenerator.Ride;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceService invoiceService = new CabInvoiceService();
        double distance = 2;
        int time = 5;
        Double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinimumFare() {
        CabInvoiceService invoiceService = new CabInvoiceService();
        double distance = 0.1;
        int time = 1;
        Double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        CabInvoiceService invoiceService = new CabInvoiceService();
        Ride[] rides = {new Ride(2, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceService.calculateFare(rides);
        Assert.assertEquals(30, fare, 0);
    }


}
