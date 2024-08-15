
/*
 * int[] a= [2,3,9,6]
 * target= 8
 * output: [0,3]
 */
import java.util.*;

public class TwoSum {

    public static void main(String args[]) {
        int a[] = { 2, 3, 5, 7 };
        int target = 8;
        int[] result = indicesTwoSum(a, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] indicesTwoSum(int[] a, int target) {
        // Approach 1: make 2 pointer i and j, find remainder (target - a[i]) in j if
        // found return the index else increase the count and iterate until found;
        // Time Complexity is O(n^2)
        for (int i = 0; i < a.length; i++) {
            int remainder = target - a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == remainder) {
                    int[] arr = { i, j };
                    return arr;
                }
            }
        }
        return null;
    }

    public static int[] indicesTwoSum1(int[] num, int target) {
        // Approach 2: Take a Map of value and index, insert the value in the map and
        // if the remainder is found as a key in the map return the value of the index
        // Time complexity of this approach is O(N) as there is only one iteration.
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i <= num.length; i++) {
            int remainder = target - num[i];
            if (mp.containsKey(remainder)) {
                int arr[] = { mp.get(remainder), i };// get key--> this returns the value(index)
                return arr;
            }
            mp.put(num[i], i);
        }
        return null;
    }
}
