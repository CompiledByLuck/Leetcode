/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class Main {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        int ans = num;
        while (ans > 9) {
            int tmp = num;
            int numsize = 0;
            while (tmp > 0) {
                tmp = tmp / 10;
                numsize++;
            }
            int[] arr = new int[numsize];
            for (int i = 0; i < arr.length; i++) {
                if (num<10){
                    arr[i] = num;
                } else {
                    arr[i] = num/10;
                    num = num/10;

                }
            }
            num = ans;
        }
        return ans;
    }
}