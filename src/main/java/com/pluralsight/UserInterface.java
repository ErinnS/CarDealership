package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner myScanner = new Scanner(System.in);

    private void init() throws IOException {

    }

    public void display() throws IOException {
        init();
        String userInput;

       while (true) {
           System.out.println("Welcome to D&B Used Cars, What can we help you with?");
           System.out.println("1)Find vehicles by price: ");
           System.out.println("2)Find vehicles by make and model: ");
           System.out.println("3)Find vehicles by year: ");
           System.out.println("4)Find vehicles by color: ");
           System.out.println("5)Find vehicles by mileage: ");
           System.out.println("6)Find vehicles by type:");
           System.out.println("7)See all vehicles: ");
           System.out.println("8)Add a vehicle: ");
           System.out.println("9)Remove a vehicle");
           System.out.println("10)Exit");
           System.out.print("Enter a number: ");
           userInput = myScanner.nextLine().trim().toUpperCase();

           if (userInput.equals("1")) {
               System.out.print("Minimum price:");
               userInput = myScanner.nextLine().trim().toUpperCase();
               System.out.print("Max price:");
               userInput = myScanner.nextLine().trim().toUpperCase();



           }
           if (userInput.equals("2")) {
               System.out.print("Enter the make: ");
               userInput = myScanner.nextLine().toUpperCase().trim();
               System.out.print("Enter the model: ");
               userInput = myScanner.nextLine().toUpperCase().trim();


           }
           if (userInput.equals("3")) {
               System.out.print("Enter minimum year: ");
               userInput = myScanner.nextLine().toUpperCase().trim();
               System.out.print("Enter maximum year: ");
               userInput = myScanner.nextLine().toUpperCase().trim();
           }
           if (userInput.equals("4")) {
               System.out.println("Enter vehicle color: ");
               userInput = myScanner.nextLine().toUpperCase().trim();


           }
       }
    }







}
