package com.FlightBooking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListOfUsers {

    private static final ArrayList<UserDetails> users = new ArrayList<UserDetails>();

//    int idCheck;
    String emailCheck;
    public static boolean checkExistingUser(String emailCheck){
        boolean result = false;
        for (int i=0;i<users.size();i++) {
            if (emailCheck.compareTo(users.get(i).getEmail())==0){ //&& idCheck==(users.get(i).getId())){
;
                result = true;
            } else {

                result = false;
            }

    } return result;

    }
    public static void addUser(){
        UserDetails user1 = new UserDetails(4531,"07756494858","Steve", "Bruce", "Stevebruce@NFC.com");
        UserDetails user2 = new UserDetails(5888,"07759689554","Jon", "Jones", "JonJones@UFC.com");
        UserDetails user3 = new UserDetails(8221,"07786730255","Steph", "Curry", "ChefCurry@nba.com");
        UserDetails user4 = new UserDetails(2274,"07912356722","Steven", "Gerard", "StevieG@LFC.com");
        UserDetails jazim = new UserDetails(9999,"07922656207","Jazim","Latif","Jazim@gmail.com");
        UserDetails rashid = new UserDetails(1001,"07922688807","Rashid","F-Walcott","Rashid@gmail.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(jazim);
        users.add(rashid);

    }

    public static void displayListOfUsers(){
        System.out.println(users);

    }

}
