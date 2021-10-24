package com.FlightBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<FlightDetails> flights = new ArrayList<>();

        FlightDetails flight1 = new FlightDetails(1, LocalDateTime.of(2021, 1, 1, 0, 0), "lHR", "PEK", "Scheduled", 100, true);
        FlightDetails flight2 = new FlightDetails(2, LocalDateTime.of(2021, 1, 1, 0, 0), "STD", "Belgium", "Scheduled", 100, true);
        FlightDetails flight3 = new FlightDetails(3, LocalDateTime.of(2021, 1, 1, 0, 0), "England", "South Korea", "Scheduled", 100, true);

        ListOfFlights flightList = new ListOfFlights(flights);
        flightList.addFlight(flight1);
        flightList.addFlight(flight2);
        flightList.addFlight(flight3);

//        ListOfFlights.displayAllFlights(flights);

        flightList.cancelFlight();

    }
}
