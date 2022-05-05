package com.bridgelabz;

import java.util.Scanner;

public class Calculate_CGPA {

    public static void main(String[] args) {   // main body of program

        int math , physics , chemistry;
        Scanner sc = new Scanner(System.in);   // Scanner is used to take the input from the user
        System.out.println("Enter your total marks of one subject");  // Marks must be out of 100
        int input = sc.nextInt();

        if(input == 100) {

            System.out.print("Math : ");
            math = sc.nextInt();

            System.out.print("Physics : ");
            physics = sc.nextInt();

            System.out.print("Chemistry : ");
            chemistry = sc.nextInt();

            float marksObtain = math + physics + chemistry;
            System.out.println("Marks yo get " +marksObtain);

            float percentage = (marksObtain / 300) * input;
            System.out.println("Percentage you achieve " + percentage + " % ");


        } else {
            System.out.println("Wrong input try again");
        }
    }
}