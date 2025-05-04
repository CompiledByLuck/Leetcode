/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */

public class Main {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    // lazy solution
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\W","");
        StringBuilder sb = new StringBuilder(s).reverse();
        String reverse = sb.toString();
        return s.compareTo(reverse) == 0;
    }
}