package com.bridgelabz;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Enter three number : ");

        //to get the input from the user
        Scanner sc = new Scanner(System.in);
        // local variable inside the class
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        // code to print the sum of three num
        int sum =num1 + num2 + num3;
        System.out.println("sum : " +sum);
    }
}
