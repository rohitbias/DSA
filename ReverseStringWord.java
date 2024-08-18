/*
 * Reverese a word in a string
 * Input s=" this is a cat"
 * output: cat a is this
 * 
 */

public class ReverseStringWord {

    public static void main(String[] args) {
        System.err.println(reverseString("this   is a   cat"));
    }

    public static String reverseString(String s) {
        String[] str = s.split("\\s+"); // this will split the string based on space
        String output = "";
        for (int i = str.length - 1; i >= 0; i--) {
            output = output + str[i] + " ";
        }
        return output.trim();
    }

}
