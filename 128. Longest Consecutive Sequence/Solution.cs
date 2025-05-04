using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace _128
{
    public class Solution
    {
        public static int LongestConsecutive(int[] nums)
        {
            int ans = 1;
            int b = 1;
            Array.Sort(nums);
            if (nums.Length == 0)
            {
                return 0;
            }
            for (int i = 0; i < nums.Length-1; i++)
            {
                if (nums[i] == nums[i + 1])
                {
                    int numIndex = Array.IndexOf(nums, nums[i]);
                    nums = nums.Where((val, idx) => idx != numIndex).ToArray();
                    i--;
                }
            }
            for (int i = 0; i < nums.Length - 1; i++)
            {
                if ((nums[i] - nums[i + 1]) == -1)
                {
                    ans++;
                }
                int a = ans;
                if (((nums[i + 1] - nums[i]) != 1) && (a <= ans))
                {
                    ans = 1;
                }
                if (a > b)
                    b = a;
            }
            return b;
        }
    }
}
