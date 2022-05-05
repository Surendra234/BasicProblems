package com.bridgelabz;

import java.util.Scanner;

public class Converion_Km_To_Miles {
    public static void main (String [] args) {
        System.out.println("Enter a number for : convert it Km to miles");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();
        double result = input * 0.621317;
        System.out.println( + input + " Km = " + result + " miles");
    }
}