package com.bridgelabz;

import java.util.Scanner;

public class Int_Or_Not {
    public static void main(String[] args) {
        System.out.println("Enter something to check it is int or not");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}