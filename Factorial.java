public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int num) {
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
