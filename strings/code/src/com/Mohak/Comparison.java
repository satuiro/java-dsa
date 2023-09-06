package com.Mohak;

public class Comparison {
    public static void main(String[] args) {
         String a = "M";
         String b = "M";
        System.out.println(a==b);

        String name1 = new String("M");
        String name2 = new String("M");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
