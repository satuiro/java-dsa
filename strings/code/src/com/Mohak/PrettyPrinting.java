package com.Mohak;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 451.23831f;
        System.out.printf("Formatted no. is %.2f",a);

        // %s (placeholders)
        System.out.println("A"+ new ArrayList<>());
        System.out.println();
        System.out.printf("My name is %s and I like %s","a","b");
    }
}
