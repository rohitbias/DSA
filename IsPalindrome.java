public class IsPalindrome {

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindromeString(s));
        System.out.println(isPalindromeNumber(121));

    }

    public static boolean isPalindromeString(String s) {
        // replace not all aplhanumeraic with null
        // Time complexity is : O(Log(N))
        // Space Complexity: O(1)
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {// loop will run to the middle
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeNumber(int n) {
        int temp = n;
        int reverse = 0;
        int remainder;

        // String nAsString=String.valueOf(n); --> this will convert the number to a
        // string and the we can write the reverse logic.

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }
}
