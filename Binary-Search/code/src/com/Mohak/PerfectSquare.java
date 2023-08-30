package com.Mohak;

import java.util.ArrayList;

public class PerfectSquare {
    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    static boolean checkIfPangram(String sentence) {
        String ab = "abcdefghijklmnopqrstuvwxyz";
//        String sentance = "";
        ArrayList<Character> li = new ArrayList<Character>();
        int num = 0;
        for (char a:sentence.toCharArray()) {
            li.add(a);
        }
        for (char c: ab.toCharArray()) {
            if (li.contains(c)){
                num++;
                break;
            }
        }
        if (num==sentence.length()){
            return true;
        }
        return false;
    }


}
