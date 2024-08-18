/* 
You are given an unsigned integer n. Return the number of 1 bits in its binary representation.
You may assume n is a non-negative integer which fits within 32-bits.

Example 1: Input: n = 00000000000000000000000000010111
Output: 4

Example 2:Input: n = 01111111111111111111111111111101
Output: 30

 */

public class BitCount {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000010111));
    }

    public static int hammingWeight(int n) {

        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {// we have 32 bits hence we have to run the loop 32 times
            if ((n & mask) != 0) {// if we perform & in any bit it will result 1.
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
}
