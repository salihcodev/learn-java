package com.salihcodev;

public class Main {

    public static void main(String[] args) {
        // implicit casting: byte > short > int > double > float
        // convert values form type to another.

        double v = 5.3;
        int t = (int)v + 4; // 9: (int)v > converting double to int, but her we lost the decimal.
        System.out.println(t);

        // explicit casting
        String g = "3";
        int f = 2;
        // int convertedAndAdded = g + f; // error: unmatched types.
         int convertedAndAdded = Integer.parseInt(g) + f; // 5: string converted to number successfully.
        System.out.println(convertedAndAdded);

        // what if the coming value is not just an integer-string = "1", "6", ...
        String a = "3.8";
        double b = 2.2;
        double withDecimal = Double.parseDouble(a) + b; // 6.0
        System.out.println(withDecimal);
    }
}