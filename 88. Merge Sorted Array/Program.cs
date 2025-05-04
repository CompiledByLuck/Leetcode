using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _88
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
            int m = 6;
            int[] nums2 = new int[] { 2, 5, 6 };
            int n = 3;
            Solution.Merge(nums1, m, nums2, n);
            foreach (int i in nums1)
            {
                Console.WriteLine(i);
            }
        }

        public class Solution
        {
            public static void Merge(int[] nums1, int m, int[] nums2, int n)
            {
                for (int i = 0; i < nums2.Length; i++)
                {
                    nums1[n + i] = nums2[i];
                    
                }
                Array.Sort(nums1);
            }
        }
    }
}