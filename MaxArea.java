/*
 * 
 * You are given an integer array heights where heights[i] represents the height of the ith bar.
You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Input: height = [1,7,2,5,4,7,3,6]
Output: 36
 */
public class MaxArea {

    public static void main(String args[]) {
        int[] height = { 1, 7, 2, 5, 4, 7, 3, 6 };
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        int begin = 0;
        int end = height.length-1;
        int maxwater = 0;
        while (begin < end) {
            // lenght ==> end - begin
            // width==>min (height[begin] , height[end]) ==>>We have to take minimum as the water can hold till min bar
            // we will multiply and compare with max water and have to return max value;
            //Update tge maxwater if the result is greater
            maxwater = Math.max(maxwater, ((end - begin) * Math.min(height[begin], height[end])));

            if (height[begin] < height[end])
                begin++;
            else
                end--;
        }
        return maxwater;
    }
}
