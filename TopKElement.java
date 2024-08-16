
/*Given an integer array nums and an integer k, return the k most frequent elements within the array.
The test cases are generated such that the answer is always unique.
You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]

Example 2:
Input: nums = [7,7], k = 1
Output: [7]

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElement {

    public static void main(String[] args) {
        int[] num = { 1, 2, 2, 1, 2, 3, 3, 3, 3 };
        System.out.println(kElements(num, 2));

    }

    public static int[] kElements(int[] num, int K) {
    /* Approach 1: Create a Map to store the element-frequency pair.
    Then sort the element-frequency pair in decreasing order of frequency.
    This gives the information about each element and the number of times they are present in the array.
    To get K elements of the array, print the first K elements of the sorted array.
    Time Complexity is O(NlogN) as sorting is used and space is O(N) */

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int[] result = new int[K];
        for (int i = 0; i < num.length; i++) {
            if (mp.containsKey(num[i])) {
                mp.put(num[i], mp.get(num[i]) + 1);
            } else {
                mp.put(num[i], 1);
            }
        }
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(
                mp.entrySet());

        // Sort the list
        Collections.sort(
                list,
                new Comparator<Map.Entry<Integer, Integer>>() {
                    public int compare(
                            Map.Entry<Integer, Integer> o1,
                            Map.Entry<Integer, Integer> o2) {
                        if (o1.getValue() == o2.getValue())
                            return o2.getKey() - o1.getKey();
                        else
                            return o2.getValue() - o1.getValue();
                    }
                });
        // store the element in the array a
        for (int i = 0; i < K; i++) {
            result[i] = list.get(i).getKey();
            System.out.println(result[i]);
        }
        return result;
    }
}
