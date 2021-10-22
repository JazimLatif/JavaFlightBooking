package com.FlightBooking;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListOfUsers.addUser();
        ListOfUsers.displayListOfUsers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FlightBooker, please enter your email to log in");
        String emailCheck = scanner.nextLine();
//        System.out.println("Please enter the unique user ID for the account belonging to " +emailCheck);
//        int idCheck = scanner.nextInt();
        if (ListOfUsers.checkExistingUser(emailCheck)){
            System.out.println("Welcome back to FlightBooker!");
        } else {
            System.out.println("No account with those details could be found");
        }



    }
}

