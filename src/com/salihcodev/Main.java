package com.salihcodev;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int YEARS_MONTHS = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyInterest = annualRate/ PERCENT / YEARS_MONTHS;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int paymentsCount = years * YEARS_MONTHS;

        double mortgage = principal *
                (monthlyInterest * Math.pow((1+monthlyInterest), paymentsCount))
                    /
                (Math.pow((1+monthlyInterest), paymentsCount) -1);

        String formatedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: ");
        System.out.println(formatedMortgage);
    }
}
