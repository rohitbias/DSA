/*Given a String, and You have to validate whether the given String is Valid Roman Numeral or not.
 If it is valid print True else False.

 Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1: Input: String = IX  
Output: True 

Example 2: Input: String = 54IVC 
Output: False

*/

import java.util.HashMap;

public class IsRomanNumber {

    public static void main(String args[]) {

        System.out.println(convertToRoman(1332));
        System.out.println(convertToNumeral("MCCCXXXII"));
    }

    public static String convertToRoman(int num) {
        String[] notation = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String result = "";
        int i = 0;
        while (num > 0) {
            if (num >= value[i]) {
                result = result + notation[i];
                num = num - value[i];
            } else
                i++;
        }
        return result;

    }

    public static int convertToNumeral(String romanString) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int result = mp.get(romanString.charAt(romanString.length() - 1));
        for (int i = romanString.length() - 2; i >= 0; i--) {
            if (mp.get(romanString.charAt(i)) < mp.get(romanString.charAt(i+1))) {
                result = result - mp.get(romanString.charAt(i));
            } else
                result = result + mp.get(romanString.charAt(i));
        }
        return result;

    }

}
