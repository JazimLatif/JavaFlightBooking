package com.FlightBooking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FlightBookingService {
    private UserDetails user;
    private ArrayList<FlightDetails> flights = new ArrayList<>();

    public FlightBookingService(){

    }

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

    public void FlightBookingMenu() throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        System.out.println("MENU" );
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" - to navigate FlightBooker follow the instructions. Please wait until all 4 options have shown. - ");
        TimeUnit.SECONDS.sleep(5);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To display all flights press : 1 ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To display booked flights press : 2 ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To book a flight press - 3 ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To cancel your existing flight press - 4 ");


 // Initially used switch statement but because the default needs to restart the menu input, a while loop was better suited

        boolean repeat = true;
        while(repeat){

            Scanner scannerMenu = new Scanner(System.in);
            String menuInput = scannerMenu.nextLine() ;

            repeat=false;

        switch (menuInput){
            case "1":
                displayAllFlights();
                break;

            case "2":
                System.out.println("Booked Flights ");
                break;

            case "3":
                System.out.println("Book A flight now ");
                break;

            case "4":
                System.out.println("Cancel your flight  ");
                break;


            default: System.out.println(" Please press one of the specified options. ");
                      repeat=true;
                      break;
        }}
    }
}
