package org.example;
import java.util.*;

public class Two {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int number=sc.nextInt();
        int rest = number % 4;

        if (rest == 0)
            System.out.println("Yes, it's a leapyear!");
        else {
            System.out.println("No, it's not a leapyear.");
        }
    }
    }


