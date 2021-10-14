package com.darrek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salesAmount, commission;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter sales amount: ");
        salesAmount = scanner.nextDouble();

        if (salesAmount > 10000) {
            commission = salesAmount * 0.30;
            System.out.printf("Commission is: " + commission);
        } else if (salesAmount > 5000) {
            commission = salesAmount * 0.20;
            System.out.printf("Commission is: " + commission);
        } else if (salesAmount > 1000) {
            commission = salesAmount * 0.10;
            System.out.printf("Commission is: " + commission);
        } else
            System.out.println("Commission: N/A");

        scanner.close();

    }
}
