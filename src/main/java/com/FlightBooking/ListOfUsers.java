package com.FlightBooking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ListOfUsers {
//    private static final ArrayList<UserDetails> users = new ArrayList<UserDetails>();
    private ArrayList<UserDetails> users = new ArrayList<>();
    private UserDetails newUser;

    public ListOfUsers(ArrayList<UserDetails> users) {
        this.users = users;
    }

    public ListOfUsers(){

    };

    //    int idCheck;
    String emailCheck;

    public boolean checkExistingUser(String emailCheck) {
        boolean result = false;
        for (UserDetails user : users) {
            if (emailCheck.compareToIgnoreCase(user.getEmail()) == 0) { //&& idCheck==(users.get(i).getId())){
                ;
                result = true;
                System.out.println("Welcome back to FlightBooker!");
                break;

            }
        }
        return result;

    }
    public void addUser(UserDetails newUser) throws InterruptedException {
        users.add(newUser);
    }

    public void addUserBase() {
        UserDetails user1 = new UserDetails(4531, "07756494858", "Steve", "Bruce", "Stevebruce@NFC.com");
        UserDetails user2 = new UserDetails(5888, "07759689554", "Jon", "Jones", "JonJones@UFC.com");
        UserDetails user3 = new UserDetails(8221, "07786730255", "Steph", "Curry", "ChefCurry@nba.com");
        UserDetails user4 = new UserDetails(2274, "07912356722", "Steven", "Gerard", "StevieG@LFC.com");
        UserDetails jazim = new UserDetails(9999, "07922656207", "Jazim", "Latif", "Jazim@gmail.com");
        UserDetails rashid = new UserDetails(1001, "07922688807", "Rashid", "F-Walcott", "Rashid@gmail.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(jazim);
        users.add(rashid);

    }

    public void addUser() throws InterruptedException {


        TimeUnit.SECONDS.sleep(1);
        System.out.println("Looks Like you are a new user, Welcome to the flight booking service");
        TimeUnit.SECONDS.sleep(2);

        Scanner scannerEmail = new Scanner(System.in);
        System.out.println("New user, To create your account please enter the Email you want to register with");
        String newUserEmail = scannerEmail.nextLine();                                             //small problem: Email check isnt done again on the sign up email
        TimeUnit.SECONDS.sleep(1);
        System.out.println(newUserEmail + " your email has been added");



            Scanner scannerFirstName = new Scanner(System.in);
            System.out.println("Enter your first name: ");
            String newUserFName = scannerFirstName.nextLine();
            TimeUnit.SECONDS.sleep(1);

            Scanner scannerLastName = new Scanner(System.in);
            System.out.println(newUserFName + ", Enter your surname: ");
            String newUserLName = scannerLastName.nextLine();
            TimeUnit.SECONDS.sleep(1);

            Scanner scannerUserPhone = new Scanner(System.in);
            System.out.println("Enter your phone number: ");
            String newUserPhone = scannerUserPhone.nextLine();
            TimeUnit.SECONDS.sleep(1);

            System.out.print("Thanks ");
            System.out.println(newUserFName + ", your new account has been created.");
            TimeUnit.SECONDS.sleep(2);


            UserDetails newestSignUp = new UserDetails(1111, newUserPhone, newUserFName, newUserLName, newUserEmail);

            boolean repeat2 = true;
            while (repeat2) {

                repeat2 =false;


                System.out.println("Confirm Correct Details to proceed to Flight Booking... Y/N? ");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(newestSignUp);

                Scanner scannerConfirm = new Scanner(System.in);
                String detailsConfirm = scannerConfirm.nextLine();


                switch (detailsConfirm.toUpperCase()) {
                    case "Y":
                        users.add(newestSignUp);
//                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Account Creation Complete");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("Welcome to FlightBooker");
                        this.displayListOfUsers();
                        break;

                    case "N":
                        System.out.println("Please re-enter your booking information, Type carefully this time");
                        addUser();
                        break;


                    default:
                        System.out.println("bruh...simple instructions cmon");
                        repeat2 = true;
                        break;
                }

            }
        }




//            boolean detailConfirmation = scannerConfirm;
//        if( detailsConfirm.equalsIgnoreCase("Y")){
//            users.add(newestSignUp);
//            TimeUnit.SECONDS.sleep(2);
//            System.out.println("Account Creation Complete");
//            System.out.println("Welcome to FlightBooker");
//            ListOfUsers.displayListOfUsers();
//        } else { System.out.println("Tooo bad then, u had one job :o "); }


    public void displayListOfUsers(){
        System.out.println(users);

    }

}
