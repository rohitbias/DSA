class ProductExceptSelf {

    public static void main(String[] args) {
        int[] num = { 1, 2, 4, 5, 6 };
        // output {240,120,60,48,40}
        int[] result = productExceptSelf1(num);
        for (int i : result)
            System.out.print(i + ",");

    }

    public static int[] productExceptSelf(int[] num) {
        /*
         * Approach 1: Multiply all the element in an array and store in a result
         * variable
         * Iterate the array and divide the result fom each index and store in output
         * array
         * return output array.Time complexity is O(N) and space complexity O(1)
         */
        int result = 1;
        for (int i = 0; i < num.length; i++) {
            result = result * num[i];
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = result / num[i];
        }
        return num;
    }

    public static int[] productExceptSelf1(int[] num) {
        /*
         * Approach 2: Here we can use prefix and suffix
         * in prefix we will store all the element from 0 to i-1
         * in suffix we will store i+1 to n
         * and then we will multiply prefix and suffix (For suffix we have to start from the end)
         * Time complexity is O(N) and space complexity O(1) if we store the prefix in the ans[]
         */
        int[] ans = new int[num.length];
        ans[0] = 1;// for 1st element initialization
        for (int i = 1; i < num.length; i++) {
            ans[i] = ans[i - 1] * num[i - 1];
        }
        int suffix = 1;
        for (int j = num.length - 1; j >= 0; j--) {
            ans[j] = ans[j] * suffix;
            suffix = suffix * num[j];
        }
        return ans;
    }
}
