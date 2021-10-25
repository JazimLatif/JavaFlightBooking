package com.FlightBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FlightBookingService {
    private UserDetails user;
    private final ListOfFlights flightList = new ListOfFlights();

    public FlightBookingService() {

    }



    public void displayAvailableFlights() throws InterruptedException {
        flightList.displayAllFlights();
        backToTheMenu();

    }

    public void displayUsersFlights() {


    }

    public void bookFlight() throws InterruptedException {
        backToTheMenu();
    }

    public void userCancelFlight() throws InterruptedException {
        flightList.cancelFlight();
        backToTheMenu();

    }

    public void FlightBookingMenu() throws InterruptedException {

//        TimeUnit.SECONDS.sleep(1);
        System.out.println("MENU");
//        TimeUnit.SECONDS.sleep(1);
        System.out.println(" - to navigate FlightBooker follow the instructions. Please wait until all 4 options have shown. - ");
//        TimeUnit.SECONDS.sleep(2);

        System.out.println("To display all flights press : 1 ");
//        TimeUnit.SECONDS.sleep(1);
        System.out.println("To display booked flights press : 2 ");
//        TimeUnit.SECONDS.sleep(1);
        System.out.println("To book a flight press - 3 ");
//        TimeUnit.SECONDS.sleep(1);
        System.out.println("To cancel your existing flight press - 4 ");


        // Initially used switch statement but because the default needs to restart the menu input, a while loop was better suited

        boolean repeat = true;
        while (repeat) {

            Scanner scannerMenu = new Scanner(System.in);
            String menuInput = scannerMenu.nextLine();

            repeat = false;

            switch (menuInput) {
                case "1":
                    System.out.println("All Available fights:");
                    displayAvailableFlights();
                    break;

                case "2":
                    System.out.println("Book A flight now");
                    bookFlight();
                    break;

                case "3":
                    System.out.println("Display your booked flights");
                    displayUsersFlights();
                    break;

                case "4":
                    System.out.println("Cancel your flight");
                    userCancelFlight();
                    break;


                default:
                    System.out.println(" Please press one of the specified options. ");
                    repeat = true;
                    break;
            }
        }
    }

    public void backToTheMenu() throws InterruptedException {
        System.out.println("To go back to the Menu, click M");
        Scanner scannerMenuBack = new Scanner(System.in);
        String backToMenu = scannerMenuBack.nextLine();
        switch (backToMenu.toUpperCase()) {
            case "M":
                FlightBookingMenu();
            default:
                backToTheMenu();
        }


    }
}


