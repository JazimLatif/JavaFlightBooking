package com.FlightBooking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListOfUsers {
    private ArrayList<UserDetails> users = new ArrayList<>();
    private UserDetails newUser;

    public ListOfUsers(ArrayList<UserDetails> users) {
        this.users = users;
    }

    public static void checkExistingUser(){

    }
    public void addUser(UserDetails newUser){
        users.add(newUser);
    }

    public static void displayListOfUsers(){

    }

}
