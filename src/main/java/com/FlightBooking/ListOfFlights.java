package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListOfFlights {
    //    array of FlightDetails objects
    private ArrayList<FlightDetails> flights = new ArrayList<FlightDetails>();
    //    private FlightDetails[] flights = new FlightDetails[20];
    private FlightDetails newFlight;
    private int flightId;

    public ListOfFlights() {}

    public ListOfFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }

    public void setFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }

    public static void addFlight(ArrayList<FlightDetails> flights, FlightDetails newFlight) {
        flights.add(newFlight);
        System.out.println("New flight added successfully.");
    }

    public static void displayAllFlights(ArrayList<FlightDetails> flights) {
        System.out.println("Getting all flights..");
        for (FlightDetails flight : flights) {
            System.out.println(flights.toString());
        }
    }

    public static void cancelFlight(ArrayList<FlightDetails> flights, int flightId) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter flight ID for the flight you would like to cancel: ");
            flightId = scanner.nextInt();
        } catch(InputMismatchException e) {
            flightId = scanner.nextInt();
            throw new InputMismatchException("Flight ID number is not recognised. Please try again.");
        }

        System.out.println("Flight " + flightId + "has been cancelled.");
    }
}
