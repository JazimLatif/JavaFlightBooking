package com.FlightBooking;

import java.util.ArrayList;

public class FlightBookingService {
    private UserDetails user;
    private ArrayList<FlightDetails> flights = new ArrayList<>();

    public FlightBookingService(UserDetails user, ArrayList<FlightDetails> flights) {
        this.user = user;
        this.flights = flights;
    }

    public void displayAllFlights() {
        for(FlightDetails flight: flights) {
            flight.toString();
        }
    }

    public void bookFlight() {
        user.getBookedFlights().toString();
    }

    public void userCancelFlight() {

    }
}
