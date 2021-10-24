package com.FlightBooking;

import java.util.ArrayList;

public class UserDetails {
    private int id;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<FlightDetails> bookedFlights = new ArrayList<>();

    public UserDetails(int id, String phoneNumber, String firstName, String lastName, String email) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<FlightDetails> getBookedFlights() {
        return bookedFlights;
    }

    public void setBookedFlights(ArrayList<FlightDetails> bookedFlights) {
        this.bookedFlights = bookedFlights;
    }
}
