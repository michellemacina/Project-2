package lab;

public class PrintPermutations {

    // recursion method
    public static void printPermutations(String str) {
        printPermutations(" ", str);
    }

    // helper method (being called in the recursion method)
    public static void printPermutations(String prefix, String str) {
        int n = str.length();

        // base case (would be if the string is empty)
        if (n == 0) {
            System.out.println(prefix);
        } else {// loop to go through the remaining characters
            for (int i = 0; i < n; i++) {
                printPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));

            }

        }

    }

    public static void main(String[] args) {
        String s = "abc";
        printPermutations(s);

    }
}
