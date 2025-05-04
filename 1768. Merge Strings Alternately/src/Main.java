/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
 */

public class Main {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        System.out.println(mergeAlternatelyNew(word1, word2));
    }

    // in-place: inserting into word2?
//    public static String mergeAlternately(String word1, String word2) {
//        return word2;
//    }

    //creating a third string
    public static String mergeAlternatelyNew(String word1, String word2) {
        StringBuilder ans = new StringBuilder(word1.length() + word2.length());
        if (word1.isEmpty()) {
            return word2;
        } else if (word2.isEmpty()) {
            return word1;
        } else {
            if (word1.length() == word2.length()) {
                for (int i = 0; i < word1.length(); i++) {
                    ans.append(word1.charAt(i));
                    ans.append(word2.charAt(i));
                }
            } else if (word1.length() < word2.length()) {
                for (int i = 0; i < word1.length(); i++) {
                    ans.append(word1.charAt(i));
                    ans.append(word2.charAt(i));
                }
                for (int i = word1.length(); i < word2.length(); i++) {
                    ans.append(word2.charAt(i));
                }
            } else {
                for (int i = 0; i < word2.length(); i++) {
                    ans.append(word1.charAt(i));
                    ans.append(word2.charAt(i));
                }
                for (int i = word2.length(); i < word1.length(); i++) {
                    ans.append(word1.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}