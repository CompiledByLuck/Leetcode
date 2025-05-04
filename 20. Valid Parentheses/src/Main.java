/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String s = "(}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Deque<Character> stringDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stringDeque.add(s.charAt(i));
            } else if (!stringDeque.isEmpty() && ((stringDeque.peekLast() == '(' && s.charAt(i) == ')')||(stringDeque.peekLast() == '{' && s.charAt(i) == '}') || (stringDeque.peekLast() == '[' && s.charAt(i) == ']'))) {
                stringDeque.removeLast();
            } else return false;
        }
        return stringDeque.isEmpty();
    }
}