/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k > 0 && k != nums.length) {
            int[] new_nums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                new_nums[(k + i) % nums.length] = nums[i];
            }
            System.arraycopy(new_nums, 0, nums, 0, nums.length);
        }
    }
}