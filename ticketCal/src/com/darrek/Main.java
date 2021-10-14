package com.darrek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int age;
    double ticketPrice;
    int numberOfTicket;
    final int price = 7;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the age: ");
    age = scanner.nextInt();
    System.out.print("Please enter the number of ticket: ");
    numberOfTicket = scanner.nextInt();

    if (age <= 5) {
        ticketPrice = price * 0.4;
        System.out.print("Your total payment is $" + ticketPrice);
            }
    else if (age >= 60){
        ticketPrice = price * 0.45;
        System.out.print("Your total payment is $" + ticketPrice);
    }
    else if (numberOfTicket >= 2){
        ticketPrice = (numberOfTicket * price) * 0.70;
        System.out.print("Your total payment is $" + ticketPrice);
    }
    else {
         System.out.print("Your total payment is $ 7");
    }
    }
}
