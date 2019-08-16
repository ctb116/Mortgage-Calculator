package com.ctb116;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculate your Mortgage");

        Scanner scanner = new Scanner(System.in);
        //get principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        //get annual interest
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        //get years
        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        
    }
}
