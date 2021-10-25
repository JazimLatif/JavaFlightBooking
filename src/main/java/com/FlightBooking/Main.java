package com.FlightBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<FlightDetails> flights = new ArrayList<>();
        ArrayList<UserDetails> users = new ArrayList<>();
        FlightBookingService flightBookingService = new FlightBookingService();
        ListOfUsers listOfUsers = new ListOfUsers();

        listOfUsers.addUserBase();
        ListOfUsers.displayListOfUsers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FlightBooker, please enter your email to log in");
        String emailCheck = scanner.nextLine();
        //        System.out.println("Please enter the unique user ID for the account belonging to " +emailCheck);
        //        int idCheck = scanner.nextInt();
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
//        FlightDetails flight1 = new FlightDetails(1, LocalDateTime.of(2021, 1, 1, 0, 0), "lHR", "PEK", "Scheduled", 100, true);
//        FlightDetails flight2 = new FlightDetails(2, LocalDateTime.of(2021, 1, 1, 0, 0), "STD", "Belgium", "Scheduled", 100, true);
//        FlightDetails flight3 = new FlightDetails(3, LocalDateTime.of(2021, 1, 1, 0, 0), "England", "South Korea", "Scheduled", 100, true);
//
//        ListOfFlights flightList = new ListOfFlights(flights);
//        flightList.addFlight(flight1);
//        flightList.addFlight(flight2);
//        flightList.addFlight(flight3);
//
//        UserDetails user1 = new UserDetails(1, "07889561507", "Kun", "Zhang", "kun@gmail.com", user1Flights);
//        UserDetails user2 = new UserDetails(2, "07834985578", "Yacine", "Hannane", "nino@gmail.com", user2Flights);
//        UserDetails user3 = new UserDetails(3, "07735783505", "Qun", "Zhang", "qun@gmail.com", user3Flights);
//
//        ListOfUsers userList = new ListOfUsers(users);
//        userList.addUser(user1);
//        userList.addUser(user2);
//        userList.addUser(user3);
//
//        FlightBookingService = new FlightBookingService(user1, user1Flights);
//        ListOfFlights.displayAllFlights(flights);
//        flightList.cancelFlight();
    }
}


