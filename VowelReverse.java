public class VowelReverse {

    public static void main(String[] args) {
        String str="leetcode";
        String str1="Hello World";
        String str2="GOP";
        System.out.println(revVowel(str));
        System.out.println(revVowel(str1));
        System.out.println(revVowel(str2));
    }

    public static String revVowel(String str) {
        char[] arr = str.toCharArray();
        int li = 0;
        int ri = str.length() - 1;
        while (li < ri) {
            char chl = arr[li];
            char chr = arr[ri];
            if (isVowel(chl) && isVowel(chr)) {// arag dono vowel hai swap them
                arr[li] = chr;
                arr[ri] = chl;
                li++;
                ri--;
            }

            else if (isVowel(chl)) {// agar left index vowel hai
                ri--;

            } else if (isVowel(chr)) {// agar sirf right index vowel hai
                li++;

            } else { // agar koi bhi vowel nahi hai
                li++;
                ri--;
            }
        }
        return String.valueOf(arr);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A')
            return true;
        else if (ch == 'e' || ch == 'E')
            return true;
        else if (ch == 'i' || ch == 'I')
            return true;
        else if (ch == 'o' || ch == 'O')
            return true;
        else if (ch == 'u' || ch == 'U')
            return true;
        else
            return false;

    }
}
