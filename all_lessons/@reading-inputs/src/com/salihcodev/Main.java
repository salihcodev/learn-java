package com.salihcodev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float typedFloatCLI = scanner.nextFloat();
        byte typedByteCLI = scanner.nextByte();
        // and so on with another types.
        // NOTE: only one scanner to use in the same place.

        System.out.print("Your name:");
        String typedLineCLI = scanner.nextLine().trim();
        System.out.println(typedLineCLI);
    }
}
