package com.darrek;
import java.util.Scanner;

public class payment {

    private static double salesAmount;
    private static double commission;

    public payment(){
    }

    public static void input(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter sales amount: ");
    salesAmount = scanner.nextDouble();
    }

    public static void check() {
        if (salesAmount > 10000) {
            commission = salesAmount * 0.30;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount > 5000) {
            commission = salesAmount * 0.20;
            System.out.println("Commission is: " + commission);
        } else if (salesAmount > 1000) {
            commission = salesAmount * 0.10;
            System.out.println("Commission is: " + commission);
        } else
            System.out.println("Commission: N/A");
    }
}
