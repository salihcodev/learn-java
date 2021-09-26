package com.salihcodev;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // types:
        byte simpleNum = 22;
        int shortNum = 22_4548;
        long longNum = 220_656_5659L;
        float decimalNum = 45.32F;
        boolean isItFull = false;
        char oneChar = 's';

        // reference types:
        Point somePoint = new Point(5,9);
        Point altPoint = somePoint;

        somePoint.y = 80;

        System.out.println(altPoint); // [5, 80]
    }
}
