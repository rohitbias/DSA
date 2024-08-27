public class StringCompression {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        char[] chars2 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        System.out.println(stringCom(chars));
        System.out.println(stringCom(chars2));

        // Output: Return 6, and the first 6 characters of the input array should be:
        // ['a','2','b','2','c','3']
        // Explanation: The groups are 'aa', 'bb', and 'ccc'. This compresses to
        // 'a2b2c3'.
    }

    public static int stringCom(char[] ch) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int i = 1;
        sb.append(ch[0]); // appending 1st char to sb.

        while (i < ch.length) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(ch[i]);
                count = 1;
            }
            i++;
        }
        if (count > 1) {
            sb.append(count);
        } // to appent last value of the count when loop is completed.

        for (int j = 0; i < sb.length(); j++) {// this is to change the original array and returning it.
            ch[j] = sb.charAt(j);
        }
        return sb.length();
    }
}
