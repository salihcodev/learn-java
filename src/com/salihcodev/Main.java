package com.salihcodev;

public class Main {

    public static void main(String[] args) {
        String forTrimText = "   this is the text   ";
        String text = "this is the text";

        System.out.println(text.replace("t", "X")); // Xhis is Xhe XexX
        System.out.println(text.length()); // 16
        System.out.println(text.endsWith("xt")); // true
        System.out.println(forTrimText.trim()); // this is the text
        System.out.println(text); // Original `text` value always, coz String is immutable.
    }
}
