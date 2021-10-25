package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        FlightBookingService flightBookingService = new FlightBookingService();
        ListOfUsers listOfUsers = new ListOfUsers();
        ListOfFlights listOfFlights = new ListOfFlights();

        listOfUsers.addUserBase();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FlightBooker, please enter your email to log in");
        String emailCheck = scanner.nextLine();
        //       System.out.println("Please enter the unique user ID for the account belonging to " +emailCheck);
        //       int idCheck = scanner.nextInt();
        if (listOfUsers.checkExistingUser(emailCheck)) {
        } else {
            System.out.println("No account with those details could be found");
            listOfUsers.addUser();
        }
        //  Next method to add is the 'menu' method with switch-case loop
        flightBookingService.FlightBookingMenu();

//        ArrayList<FlightDetails> user1Flights = new ArrayList<>();
//        ArrayList<FlightDetails> user2Flights = new ArrayList<>();
//        ArrayList<FlightDetails> user3Flights = new ArrayList<>();
//



//
//        FlightBookingService = new FlightBookingService(user1, user1Flights);
//        ListOfFlights.displayAllFlights(flights);
//        flightList.cancelFlight();
    }
}


