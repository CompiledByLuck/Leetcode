/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-5, -3, -2, -1};
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] sorted = sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    //cheated!
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = result.length - 1; i > -1; i--) {
            if (nums[right] > nums[left]) {
                result[i] = nums[right];
                right--;
            } else {
                result[i] = nums[left];
                left++;
            }
        }
        return result;
    }
}