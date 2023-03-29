package com.cabinvoicegeneratortest;

import com.cabinvoicegenerator.CabInvoiceService;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceService invoiceService = new CabInvoiceService();
        Double distance = 2.0;
        int time = 5;
        Double fare = invoiceService.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);

    }
}
