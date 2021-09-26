package com.salihcodev;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // COMPARISON OPERATORS::
        /*
        * <
        * >
        * !
        * !=
        * ||
        * &&
        * <=
        */
        int x = 5;
        int y = 10;
        System.out.println(x == y); // false

        // LOGICAL OPERATORS::
        // && and-operator
        boolean isGood = x > y && x > y; // false
        boolean _isGood = x < y && x > y; // false
        System.out.println(isGood);
        System.out.println(_isGood);

        // || or-operator
        boolean isGoodAlt = x < y || x < y; // true
        boolean _isGoodAlt = x > y || x > y; // false
        boolean __isGoodAlt = x > y || x < y; // true
        System.out.println(isGoodAlt);
        System.out.println(_isGoodAlt);
        System.out.println(__isGoodAlt);

        // IF STATEMENTS::
        if(true) {
            //
        }else if (true) {
            //
        }else {
            //
        }

        // TERNARY OPERATOR::
        String rightCalc = 5*5 == 25 ? "this is right" : "nope!";

        // SWITCH STATEMENT::
        switch (rightCalc) {
            case "this is right":
            System.out.println("Good calculation!!");
            break;

            case "nope!":
                System.out.println("You ar bad in math :(");

            default:
                System.out.println("Go ahead and make calculation.");
        }

        // LOOPS::
        // for loop:
        for (int i = 0; i < 3; i++){
            System.out.println(i); // 0, 1, 2
        }

        // shortcut to write a for loop:
        String[] things = {"hi", "bey", "tri"};
        for (String thing : things) {
            System.out.println(thing);
        }

        // while loop:
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print(">> ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("quit"))
                break;
            System.out.println(input);

        }

        // do-while loop:
        do {
            System.out.print(">> ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }  while (!(input.equals("quit")));
    }
}
