/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        while (num > 9) {
            char[] ch = Integer.toString(num).toCharArray();
            int[] digits = new int[ch.length];
            for (int i = 0; i < ch.length; i++) {
                digits[i] = Character.digit(ch[i], 10);
            }
            for (int i = 1; i < digits.length; i++) {
                digits[0] += digits[i];
                num = digits[0];
            }
        }
        return num;
    }
}