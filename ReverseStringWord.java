/*
 * Reverese a word in a string
 * Input s=" this is a cat"
 * output: cat a is this
 * 
 */

public class ReverseStringWord {

    public static void main(String[] args) {
        System.err.println(reverseString("   this   is a   cat    "));
    }

    public static String reverseString(String s) {
        String[] str = s.trim().split("\\s+"); // this will split the string based on space.
        // Time complexity of trim and split function is O(N)
        StringBuilder output = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            output.append(str[i]);
            output.append(' ');

        }
        return output.toString();
    }
}
// Note: Time complexity of concoatening a string (Output+=str[i]) is O(N) where
// as Time complexity of appending a string is o(1)
