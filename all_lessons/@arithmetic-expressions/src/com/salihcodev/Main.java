package com.salihcodev;

public class Main {

    public static void main(String[] args) {
        int division = 20 / 7; // 2.0 : which is mess.
        double divisionArithmetically = (double)20 / (double)7; // 2.857142857142857 : which is the right result.
        System.out.println(division);

        // double is converting the 20 & 7 to floats
        // ..that can be operate some mathematics operations with non-unexpected behaviors.
        System.out.println(divisionArithmetically);


        // postfix & prefix:
        // `y` got initialized with `x` value, then we modify the `x` value.
        int x = 1; // 2
        int y = x++; // 1 postfix

        // here `w` got initialized with the modified `z's` value.
        int z = 1; // 2
        int w = ++z; // 2 prefix

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);


        // augmented of compound assignment operator || using the last val value while math operation
        int t = 5;
        t += 5; // 10 : 5 + 5
        System.out.println(t);

        // t now = 10
        t *= 5; // 50 : 10 + 50
        System.out.println(t);

        // t now = 50
        t /= 5; // 10 : 50 / 10
        System.out.println(t);
    }
}


// BE AWARE THE TO MAKE MATH OPERATIONS UNDER MATH'S OPERATIONS RULES : () => / and * => * and - ...etc