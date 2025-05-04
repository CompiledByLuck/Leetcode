/*
You are given a string s.
Your task is to remove all digits by doing this operation repeatedly:
Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.
*/

public class Main {
    public static void main(String[] args) {
        //System.out.println(ClearDigits("2H2el22o"));
        System.out.println(removeDigits("2H2el22o"));
    }

    // Genius code from chatGPT with O(n) time using two-pointers approach.
    public static String removeDigits(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        // Pointer to track the last non-digit character in the result
        int lastNonDigitIndex = -1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                // Remove the last non-digit character from the result if it exists
                if (lastNonDigitIndex >= 0) {
                    result.deleteCharAt(lastNonDigitIndex);
                    lastNonDigitIndex--; // Adjust pointer
                }
            } else {
                // Add the non-digit character to the result and update the pointer
                result.append(ch);
                lastNonDigitIndex = result.length() - 1;
            }
        }
        return result.toString();
    }

    // My cringe code... O(n^2)
    public static String ClearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        char ch;
        char ch2;
        for (int i = 0, j = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (i == 0) {
                    str.deleteCharAt(i);
                    i--;
                    j--;
                } else {
                    str.deleteCharAt(i);
                    j--;
                    ch2 = str.charAt(j);
                    i--;
                    if (Character.isAlphabetic(ch2)) {
                        str.deleteCharAt(j);
                        j--;
                        i--;
                    }
                }
            }
            j++;
        }
        s = str.toString();
        return s;
    }
}