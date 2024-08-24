public class StringGCD {

    public static void main(String[] args) {
        String s1 = "ABABABAB";
        String s2 = "ABAB";
        // output="AB";
        System.out.println(subString(s1, s2));

    }

    public static String subString(String a, String b) {

        if ((a + b).equals(b + a)) {
            int l1 = a.length();
            int l2 = b.length();
            return a.substring(0, findGCD(l1, l2));
        } else
            return "";
    }

    public static int findGCD(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
}
