package com.salihcodev;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // creating an array::
        // basic way:
        char[] chars = new char[2];
        chars[0] = 'g';
        chars[1] = 'f';
        System.out.println(Arrays.toString(chars)); // [g, f]


        // elegant way (shortcut):
        int[] numbers = {0,5,8,9,7}; // [0, 5, 8, 9, 7]
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // [0, 5, 7, 8, 9] : sorted the `numbers` arr ->
        System.out.println(Arrays.toString(numbers)); // : print it later


        // multi dimensions array
        // 2D arrays: can apply 3D array too.
        int[][] arr1 = {{ 5, 5 }, { 3, 3 }};
        System.out.println(Arrays.deepToString(arr1));

        // old way:       2rows | 3cols
        int[][] arr2 = new int[5][3];
        arr2[3][2] = 5; // this means the 3ed val of the 4th array = 5 LIKE: [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 5], [0, 0, 0]
        arr2[0][1] = 110; // this means the second val of the index array = 110 Like [[0, 110, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]
        System.out.println(Arrays.deepToString(arr2));
    }
}
