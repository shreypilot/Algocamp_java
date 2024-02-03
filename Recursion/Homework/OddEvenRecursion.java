public class OddEvenRecursion {

    public static void main(String[] args) {
        int N = 6;
        printOddEven(N);
    }

    public static void printOddEven(int n) {
        if (n > 0) {
            if (n % 2 != 0) {
                // If n is odd, print it and recursively call with n - 2
                System.out.print(n + " ");
                printOddEven(n - 2);
            } else {
                // If n is even, recursively call with n - 1 and then print n
                printOddEven(n - 1);
                System.out.print(n + " ");
            }
        }
    }
}
