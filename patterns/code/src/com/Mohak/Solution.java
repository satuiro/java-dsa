package com.Mohak;

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int charIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i==maxJump){
                charIndex = i;
                break;
            }
        }
        if (charIndex+minJump==s.length()-1){
            return true;
        }
        return false;

    }
}