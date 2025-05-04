/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _169.Majority_Element
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] nums = { 6, 5, 5 };
            Console.WriteLine(Solution.MajorityElement(nums));
        }
    }
    public class Solution
    {
		// O(n^2) poopoo code
        public static int MajorityElement(int[] nums)
        {
            int k = nums.Length/2;
            int n = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                int a = 0;
                for (int j = 0; j < nums.Length; j++)
                {
                    
                    if (nums[i] == nums[j])
                    {
                        a++;
                    }
                    if (a > k)
                    {
                        n = nums[i];
                        return n;
                    }
                }
            }
            return n;
        }
    }
}
