/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    // cringe code below!
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int a = 0;
        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) a++;
        }
        return a == 0;
    }
}