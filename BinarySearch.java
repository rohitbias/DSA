/*
 * For Binary search the array should be sorted. Arrays.sort(num)
 * Find Mid index= start+end/2
 * if num[midindex] == searchNumber; found = ture; return index;
 * if num[midindex]<number; start= mid+1 index else end = midindex-1
 */



import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = { 1, 3, 4, 5, 7, 8, 9,13 };
        int number = 6;
        Arrays.sort(num);// this will sort the array
        System.out.println(binaryNumberSearch(num, number));

    }
// Time Complexity: O(log N)
// Auxiliary Space: O(1)
    public static int binaryNumberSearch(int[] n, int searchNumber) {
        int start = 0;
        int end = n.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (n[mid] == searchNumber) {
                return mid;
            }
            if (n[mid] < searchNumber)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start; //start (if we want to find the missing number has to be entered at which index)
    }
    // Time Complexity: O(N)    
    // Auxiliary Space: O(1)
    public static int linearNumberSearch(int[] n, int searchNumber){
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==searchNumber)
            return i;
            break;
        }
        return -1;
    }
}

