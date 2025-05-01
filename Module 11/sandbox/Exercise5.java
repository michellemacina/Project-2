package sandbox;

public class Exercise5 {

    // base case 0 when b is 0
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        // need to put an if to make sure b is not negative
        if (b < 0) {
            return -multiply(a, -b);
        }
        // recursion a + (a(b-1))
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
        System.out.println(multiply(3, -4));
    }

}
