package com.FlightBooking;

import java.util.ArrayList;

import java.util.Objects;

public class UserDetails {
    private int id;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String email;
    private PassportDetails userPassport;
    private ArrayList<FlightDetails> bookedFlights;
    PassportDetails passport = new PassportDetails("", "");


//    public UserDetails(int id, String phoneNumber, String firstName, String lastName, String email, ) {
//        this.id = id;
//        this.phoneNumber = phoneNumber;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//    }

    public UserDetails(int id, String phoneNumber, String firstName, String lastName, String email,PassportDetails userPassport, ArrayList<FlightDetails> bookedFlights) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userPassport = userPassport;
        this.bookedFlights = bookedFlights;
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

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", passport=" + passport +
                '}';
    }
}
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, phoneNumber, firstName, lastName, email, passport);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

//    @Override
//    public boolean equals(Object id) {
//        if (this == id) return true;
//        if (id == null || getClass() != id.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(phoneNumber, person.phoneNumber) && gender == person.gender;
//};
