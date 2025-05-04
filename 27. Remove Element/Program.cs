/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.
int k = removeElement(nums, val); // Calls your implementation
assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _27
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
            int val = 2;
            Solution.RemoveElement(nums, val);
            Console.WriteLine(Solution.RemoveElement(nums, val));
            foreach (var item in nums)
            {
                Console.WriteLine(item);
            }
            Console.ReadLine();
        }
    }

    public class Solution
    {
        public static int RemoveElement(int[] nums, int val)
        {
            int[] dist = new int[] { };
            dist = Array.FindAll(nums, x => x == val);
            int[] n = new int[nums.Length - dist.Length];
            int k = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[i] != val)
                {
                    n[k] = nums[i];
                    k++;
                }
            }
            n.CopyTo(nums, 0);
            return nums.Length - dist.Length;
        }
    }
}