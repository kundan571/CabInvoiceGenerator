package com.cabinvoicegeneratortest;

import com.cabinvoicegenerator.CabInvoiceService;
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
}
