package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<FlightDetails> flights = new ArrayList<>();
        int flightId;

        FlightDetails flight1 = new FlightDetails(1, LocalDateTime.of(2021, 1, 1, 0, 0), "lHR", "PEK", "Scheduled", 100, true);
        FlightDetails flight2 = new FlightDetails(2, LocalDateTime.of(2021, 1, 1, 0, 0), "STD", "Belgium", "Scheduled", 100, true);
        FlightDetails flight3 = new FlightDetails(3, LocalDateTime.of(2021, 1, 1, 0, 0), "England", "South Korea", "Scheduled", 100, true);

        ListOfFlights.addFlight(flights, flight1);
        ListOfFlights.addFlight(flights, flight2);
        ListOfFlights.addFlight(flights, flight3);

        ListOfFlights.displayAllFlights(flights);

//        ListOfFlights.cancelFlight(flights, flightId);

    }
}
