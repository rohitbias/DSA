/*
 * n=[1,2,3,5]
 * output=4
 * 
 * XOR--> If both number are different the result is 1 else 0
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] num = { 1, 5, 4, 3 };
        System.out.println(missingNumberXOR(num));

    }
    // Approach 1: In this approach Integer overflow may occur if we have long
    // range.
    // Time Complexity O(N) and space Complexity is O(1)
    public static int missingNumber(int[] num) {
        int totalNumbers = num.length + 1;// as there is one number which is missing
        int sum = (totalNumbers * (totalNumbers + 1)) / 2; // sum of n natural numbers is n*(n+1)/2
        int arraySum = 0;
        int arrayLength = num.length - 1;
        while (arrayLength >= 0) {
            arraySum = arraySum + num[arrayLength];
            arrayLength--;
        }
        return sum - arraySum;
    }
    // Approach 2: XOR-->> (XOR the n natural number) XOR (XOR the array elements)
    // The result of XOR of similar element is zero.

    public static int missingNumberXOR(int[] num) {
        int result = num[0];
        for (int i = 1; i < num.length; i++) {
            result = result ^ num[i]; // The result of XOR of similar element is zero.
        }
        int result2 = 1;
        for (int i = 2; i <= num.length + 1; i++)// as there is one number which is missing
        {
            result2 = result2 ^ i;
        }
        return result ^ result2;
    }
}
