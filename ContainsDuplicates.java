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

class ContainsDuplicates {
    public static void main(String args[]) {
        int[] nums = { 1, 24, 3, 4, 1 };
        String[] names = { "Rohit", "mayank", "Ram", "Shyam" };
        System.out.println(hasDuplicatesNumber(nums));
        System.out.println(hasDuplicateString(names));

    }

    public static boolean hasDuplicatesNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }

    public static boolean hasDuplicateString(String[] name) {
        HashSet<String> names = new HashSet<String>();
        for (int i = 0; i < name.length; i++) {
            if (names.contains(name[i])) {
                return true;
            }
            names.add(name[i]);
        }
        return false;
    }
}

// Time Complexity is : O(n) ---> where n is lenght of the array/String passed
// and it takes O(1) to insert or access any element in an HashSet