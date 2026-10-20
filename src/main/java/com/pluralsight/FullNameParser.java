package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = nameScanner.nextLine().trim();
        int spaceIndex = name.indexOf(' ');
        firstName = name.substring(0, spaceIndex);
        String rest = name.substring(spaceIndex + 1);

        if (rest.contains(" ")){
            spaceIndex = rest.indexOf(' ');
            middleName = rest.substring(0, spaceIndex);
            lastName = rest.substring(spaceIndex + 1);
        }
        else{
            lastName = rest;
            middleName = "(none)";
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);


    }
}
