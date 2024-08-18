public class BitCount {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000010111));
    }

    public static int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            count = count + (n & 1);
            n >>>= 1;
        }
        return count;
    }
}
