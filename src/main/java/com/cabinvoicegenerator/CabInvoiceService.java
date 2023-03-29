package com.cabinvoicegenerator;

public class CabInvoiceService {
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;

    public Double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_MINUTE;
        if (totalFare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        } else {
            return totalFare;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Cab Invoice Generator:!!");
        CabInvoiceService invoiceService = new CabInvoiceService();
        System.out.println(invoiceService.calculateFare(2.0, 5));
    }
}
