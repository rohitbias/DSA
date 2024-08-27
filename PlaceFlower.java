/*
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

First find if how many max plants can be planted?
if max>= n, then it can be planted
when all are zero--> length+1/2 plants can be planted.
when we have 0's in starting and ending==>c/2
when we have zeros in the center c-1/2


*/

public class PlaceFlower {

    public static void main(String[] args) {

        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int places = 1;
        System.out.println(solution(flowerbed, places));

    }

    public static boolean solution(int[] fls, int places) {

        int max = 0;
        int fi = -1;
        int li = -1; // first we will find the 1st and last 1 index

        for (int i = 0; i < fls.length; i++) {
            if (fls[i] == 0) // iterating to find 1s
                continue;
            else if (fi == -1) { // when 1 is found and fi is -1 set the index.
                fi = i;
                li = i;
            } else // after above if we get 1 we will only move the last index.
                li = i;
        }
        // all zeros and there is no 1 in the array.
        if (fi == -1) {
            max = (fls.length + 1) / 2;
        } else {// calculating the 1st zeros
            int left = fi;// left zeros
            int right = fls.length - 1 - li;// right zero will last value of li(which holds 1)
            max = left / 2;
            max = max + right / 2;
        }
        // now getting count in the middle b/w 1st index and last index
        int count = 0;
        for (int i = fi + 1; i < li - 1; i++) {
            if (fls[i] == 0)
                count++;
            else {
                max += (count - 1) / 2;
                count = 0;
            }
            max += (count - 1) / 2;
        }

        return places<=max;
    }
}
