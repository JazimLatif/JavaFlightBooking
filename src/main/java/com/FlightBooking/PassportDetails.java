package com.FlightBooking;

public class PassportDetails {

    private String passportNumber;
    private String nationality;

    public PassportDetails(String passportNumber, String nationality) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
