package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = nameScanner.nextLine().trim();
        int spaceIndex = name.indexOf(' ');
        String firstName = name.substring(0, spaceIndex);
        String rest = name.substring(spaceIndex + 1);
        System.out.println(firstName);
        boolean middleNameCheck = rest.contains(" ");
        System.out.println(middleNameCheck);

    }
}
