/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
    An integer x.
        Record a new score of x.
    '+'.
        Record a new score that is the sum of the previous two scores.
    'D'.
        Record a new score that is the double of the previous score.
    'C'.
        Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.
The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 */

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        for (String operation : operations) {
            if (tryParseInt(operation, 0) != 0) {
                stack.push(Integer.parseInt(operation));
            } else if (Objects.equals(operation, "D")) {
                stack.push(stack.peek() * 2);
            } else if (Objects.equals(operation, "+")) {
                stack.push(plus(stack));
            } else if (Objects.equals(operation, "C")) {
                stack.pop();
            }
        }
        while (!stack.empty()) {
            n += stack.peek();
            stack.pop();
        }
        return n;
    }

    public static int plus(Stack<Integer> stack) {
        if (stack.capacity() > 1) {
            int n = stack.peek();
            int b = stack.elementAt(stack.size() - 2);
            return b + n;
        } else return stack.peek();
    }

    public static int tryParseInt(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }
}