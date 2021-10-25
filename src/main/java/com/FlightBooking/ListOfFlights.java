package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfFlights {
    //    array of FlightDetails objects
    private ArrayList<FlightDetails> flights = new ArrayList<FlightDetails>();
    private FlightDetails newFlight;
    private ArrayList<UserDetails> users;


    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    private int flightId;

    public ListOfFlights() {
        FlightDetails flight1 = new FlightDetails(1, LocalDateTime.of(2021, 1, 1, 0, 0), "lHR", "PEK", "Scheduled", 100, true);
        FlightDetails flight2 = new FlightDetails(2, LocalDateTime.of(2021, 1, 1, 0, 0), "STD", "Belgium", "Scheduled", 100, true);
        FlightDetails flight3 = new FlightDetails(3, LocalDateTime.of(2021, 1, 1, 0, 0), "England", "South Korea", "Scheduled", 100, true);


        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);



    }


    public ListOfFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }

    public void setFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }




    public void displayAllFlights() {
        for (FlightDetails flight : flights) {
            System.out.println(flight.toString());
        }
    }



    public void cancelFlight() {


        Scanner scanner = new Scanner(System.in);
        boolean flightIsMatch = false;
        String areYouSure;
        int flightNumber;
        int index = 0;
        boolean loop=true;
        while(loop) {
            System.out.println("Enter flight number for the flight you would like to cancel: ");
            System.out.println(this.flights);
            // Check if flight is a valid integer
            if (!scanner.hasNextInt()) {
                System.out.println("That wasn't a number, Please try again. ");
                scanner.nextLine();
                continue;
            }

            flightNumber = scanner.nextInt();

            // check flight number matches database
            for (FlightDetails flight : this.flights) {
                System.out.println("check1");
                if (flightNumber == flight.getFlightNumber()) {
                    flightIsMatch = true;
                    System.out.println("Flight found.");
                    System.out.println(flight);
                    break;
                }
                index++;
            }

            if (!flightIsMatch) {
                index = 0;
                System.out.println("Flight number is not recognised. Please try again. ");
                scanner.nextLine();

                continue;
            }

            System.out.println("Are you sure you would like to cancel flight number " + flightNumber + "? [yes/no]");

            // Check user input (yes/no) and set flight status to cancelled
            while(true) {
                areYouSure = scanner.next();
                if (areYouSure.equalsIgnoreCase("yes")) {
                    flights.get(index).setStatus("Cancelled");
                    System.out.println(flights.get(index));
                    System.out.println("Flight number " + flightNumber + " has been cancelled.");
                    flights.remove(index);
                    System.out.println(flights);
                    loop=false;
                    break;
                } else if (areYouSure.equalsIgnoreCase("no")){
                    System.out.println("Process cancelled. Going back to menu");
                    break;
                }
                else {
                    System.out.println("Please enter [yes/no].");
                }

            }
        }

    }

//    public void bookUserFlight() {
//        ListOfUsers users = new ListOfUsers();
//        displayAllFlights();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please select which flight you would like to book by typing the flight number");
//        int bookingNumber = scanner.nextInt();
//        for (FlightDetails flight : this.flights) {
//            System.out.println("check1");
//            if (bookingNumber == flight.getFlightNumber()) {
//                System.out.println("Flight booked");
//                users.userFlights.add(flight);
//                displayBookedFlights();
//                break;
//            }
//        }
//
//
//
//    }

}
