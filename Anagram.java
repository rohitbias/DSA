import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        String str1 = "anagram";
        String str2 = "naamarg";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram1(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2) {
        // in this apprach the time complexity is O(NlogN)--> Merge Sort
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static boolean isAnagram1(String str1, String str2) {
        // in this apprach the time complexity is O(N)
        int[] count = new int[26];

        for (char c : str1.toCharArray()) {
            count[c - 'a']++; // ascii value a=97- z= 122 ==> a (97) - 97 = 0
        }
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
