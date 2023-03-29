package com.cabinvoicegenerator;

public class CabInvoiceService {
    private static final Double MINIMUM_COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_MINUTE = 1;

    public Double calculateFare(Double distance, int time) {
        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_MINUTE;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Cab Invoice Generator:!!");
        CabInvoiceService invoiceService = new CabInvoiceService();
        System.out.println(invoiceService.calculateFare(2.0,5));
    }
}
