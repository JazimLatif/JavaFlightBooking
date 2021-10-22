package com.FlightBooking;

import java.time.LocalDateTime;

public class FlightDetails {
    private int flightNumber;
    private LocalDateTime dateTime;
    private String departureCountry;
    private String destinationCountry;
    private String status;
    private int maxCapacity;
    private boolean isAvailableToBook;

    public FlightDetails(int flightNumber, LocalDateTime dateTime, String departureCountry, String destinationCountry, String status, int maxCapacity, boolean isAvailableToBook) {
        this.flightNumber = flightNumber;
        this.dateTime = dateTime;
        this.departureCountry = departureCountry;
        this.destinationCountry = destinationCountry;
        this.status = status;
        this.maxCapacity = maxCapacity;
        this.isAvailableToBook = isAvailableToBook;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDepartureCountry() {
        return departureCountry;
    }

    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isAvailableToBook() {
        return isAvailableToBook;
    }

    @Override
    public String toString() {
        return ("Flight Number: " + flightNumber +
                ", Date/Time of Departure: " + dateTime +
                ", Departure Country: " + departureCountry + '\'' +
                ", Destination Country: " + destinationCountry + '\'' +
                ", Current Status: " + status + '\'' +
                ", Maximum Passenger Capacity: " + maxCapacity +
                ", isAvailableToBook: " + isAvailableToBook);
    }
}
