public class MoveZero {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 5, 0, 7, 9, 11, 0, 12 };
        int[] zeroArray = moveZeros(nums);
        for (Integer a : zeroArray) {
            System.out.print(a);
        }
    }

    public static int[] moveZeros(int[] nums) {
        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }
}
