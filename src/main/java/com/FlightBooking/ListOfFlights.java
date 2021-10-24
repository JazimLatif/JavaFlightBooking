package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ListOfFlights {
    //    array of FlightDetails objects
    private ArrayList<FlightDetails> flights = new ArrayList<FlightDetails>();
    private FlightDetails newFlight;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    private int flightId;

    public ListOfFlights() {}

    public ListOfFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }

    public void setFlights(ArrayList<FlightDetails> flights) {
        this.flights = flights;
    }

    public void addFlight(FlightDetails newFlight) {
        flights.add(newFlight);
        System.out.println("New flight added successfully.");
    }

    public void displayAllFlights() {
        System.out.println("Getting all flights..");
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

        while(true) {
            System.out.println("Enter flight number for the flight you would like to cancel: ");

            // Check if flight is a valid integer
            if (!scanner.hasNextInt()) {
                System.out.println("Flight number is not recognised. Please try again. ");
                scanner.nextLine();
                continue;
            }

            flightNumber = scanner.nextInt();

            // check flight number matches database
            for (FlightDetails flight : this.flights) {
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
                if (areYouSure.toLowerCase().equals("yes")) {
                    flights.get(index).setStatus("Cancelled");
                    System.out.println(flights.get(index));
                    System.out.println("Flight number " + flightNumber + " has been cancelled.");
                    break;
                } else if (areYouSure.toLowerCase().equals("no")){
                    System.out.println("Process cancelled. Going back to menu");
                    break;
                }
                else {
                    System.out.println("Please enter [yes/no].");
                }
            }
        }

    }
}
