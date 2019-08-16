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
        short years = scanner.nextShort();

        float monthlyInterest = (annualInterest/100)/12;
        short months = (short) (years*12);

        //  P( r(1 + r)^n  /  ((1 + r)^n) - 1) )

        double top = monthlyInterest * (Math.pow((1 + monthlyInterest), months));
        double bottom = (Math.pow((1 + monthlyInterest), months)) - 1;
        double mortgage = principal * (top / bottom);

        System.out.println(mortgage);

    }
}
