package Function;

public class FunctionDemo {

    public static void main(String[] args) {// here arguments are array of strings

        System.out.println("Let's get started");
        // calling a function
        greetingCustomers();
        System.out.println("see you soon!");
        int res = addNumbers(25, 10);
        System.out.println(res);
        int res2 = addNumbers();
        System.out.println(res2);
        // addNumbers(5,10);
        // addNumbers(26,30);

        for (int i = 1; i <= 5; i++) {
            int result = getSquare(i);
            System.out.println("square of " + i + "is:" + result);
        }

        System.out.println("------CASE1------");
        int one = 10;
        int two = 20;
        int sum = scopes(one, two);
        System.out.println(sum);

        System.out.println("------CASE2------");

        System.out.println(one + "," + two);
        swap(one, two);
        System.out.println(one + "," + two);

    }

    // function with same name but different parameters
    public static void swap(int one, int two) {
        System.out.println(one + "," + two);
        int temp = one;
        one = two;
        two = temp;
        System.out.println(one + "," + two);
    }

    public static int scopes(int one, int another) {
        int sum = one + another;
        return sum;
    }

    public static int getSquare(int x) {
        return x * x;
    }

    public static int addNumbers() {// you can pass any no. of arguments

        int a = 5;
        int b = 10;

        int sum = a + b;
        return sum;
    }

    public static int addNumbers(int val1, int val2) {// you can pass any no. of arguments

        int sum = val1 + val2;
        return sum;
    }

    // Declaring a function
    public static void greetingCustomers() {

        System.out.println("Hello To You!");
        System.out.println("Hope you're having a good Day!");
    }

}