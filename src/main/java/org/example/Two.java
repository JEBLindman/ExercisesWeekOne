package org.example;

import jdk.nashorn.internal.parser.Scanner;

public class Two {

    public static void main (String[] args) {
        int number = 34;
        int rest = number % 4;

        if (rest == 0)
            System.out.println("Yes, it's a leapyear!");
        else {
            System.out.println("No, it's not a leapyear.");
        }
    }
    }


