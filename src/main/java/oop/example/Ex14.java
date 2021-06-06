
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex14 {
    public static String stateWI = "WI";
    public static void main(String[] args) {
        double total, tax = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        String orderString = scanner.nextLine();
        double order = Integer.parseInt(orderString);

        System.out.println("What is the state?");
        String state = scanner.nextLine();

        if(stateWI.equals(state)){
            tax = order * 0.055;
            total = order * (0.055 * 100);
        }
        else {
            total = order;
        }

        System.out.println("The subtotal is $" + order);
        System.out.println("The tax is $" + tax);
        System.out.println("The total is $" + total);
    }
}