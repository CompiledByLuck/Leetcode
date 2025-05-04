/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _128
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] nums = { -2, -3, -3, 7, -3, 0, 5, 0, -8, -4, -1, 2 };
            Console.WriteLine(Solution.LongestConsecutive(nums));
            Console.ReadKey();
        }
    }
}