import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        char[] arr1 = s.toLowerCase().toCharArray();
        for (int i = 0; i < arr1.length; i++){
            if (Character.isLetterOrDigit(arr1[i])){
                sb.append(arr1[i]);
            }
        }
        StringBuilder sb1 = new StringBuilder();


        char[] arr2 = sb.toString().toCharArray();
        for (int i = arr2.length-1; i >=0; i--){
            if (Character.isLetterOrDigit(arr2[i])){
                sb1.append(arr2[i]);
            }
        }
        return (sb1.toString().equals(sb.toString()));
    }

}