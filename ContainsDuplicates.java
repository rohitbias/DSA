/*
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]
Output: true

Example 2:

Input: nums = [1, 2, 3, 4]
Output: false

*/



import java.util.*;

class ContainsDuplicates{
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3, 4,1};
        int[] nums1 = {1,1, 2, 3, 3};
        System.out.println(hasDuplicates(nums));
        System.out.println(hasDuplicates(nums1));
    }


    public static boolean hasDuplicates(int [] nums)
    {
        HashSet<Integer> hs= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
                if(hs.contains(nums[i]))
                {
                return true;
            }
        hs.add(nums[i]);
        }
        return false;
    }      
}