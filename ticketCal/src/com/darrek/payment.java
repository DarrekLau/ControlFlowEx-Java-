package com.darrek;

import java.util.Scanner;

public class payment extends Main {

    private static double ticketPrice;
    private static int age;
    private static int numberOfTicket;
    private static int price = 7;

    public payment(int age, double ticketPrice, int numberOfTicket, int price) {
        payment.age = age;
        payment.ticketPrice = ticketPrice;
        payment.numberOfTicket = numberOfTicket;
        payment.price = price;
    }

    public static void input(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the age: ");
    age = scanner.nextInt();
    System.out.print("Please enter the number of ticket: ");
    numberOfTicket = scanner.nextInt();
    }

    public static void check() {
         if (age <= 5) {
            ticketPrice = price * 0.4;
            System.out.print("Your total payment is $" + ticketPrice);
        } else if (age >= 60) {
            ticketPrice = price * 0.45;
            System.out.print("Your total payment is $" + ticketPrice);
        } else if (numberOfTicket >= 2) {
            ticketPrice = (numberOfTicket * price) * 0.70;
            System.out.print("Your total payment is $" + ticketPrice);
        } else {
            System.out.print("Your total payment is $ 7");
        }
    }
}
