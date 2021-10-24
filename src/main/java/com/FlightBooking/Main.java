package com.FlightBooking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ListOfUsers.addUserBase();
        ListOfUsers.displayListOfUsers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FlightBooker, please enter your email to log in");
        String emailCheck = scanner.nextLine();
//        System.out.println("Please enter the unique user ID for the account belonging to " +emailCheck);
//        int idCheck = scanner.nextInt();
        if (ListOfUsers.checkExistingUser(emailCheck)) {
        }
        else {
            System.out.println("No account with those details could be found");
            ListOfUsers.addUser();
        }
        //  Next method to add is the 'menu' method with switch-case loop
        FlightBookingService.FlightBookingMenu();




    }
}


