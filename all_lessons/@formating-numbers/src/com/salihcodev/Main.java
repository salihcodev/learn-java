package com.salihcodev;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(1556548)); // $1,556,548.00

        // you don't need to initialize NumberFormat in ever time you use it.
        String percent = NumberFormat.getPercentInstance().format(0.35); // 35%
        System.out.println(percent);
    }
}