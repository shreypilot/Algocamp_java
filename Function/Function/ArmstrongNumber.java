//A Positive integer is called as Armstrong Number if 
//abc = a^n + b^n +c^n
//153 ->1^3 + 5^3 + 3^3
//1634 ->1^4+6^4+3^4+4^4

//Given an input number,true/false,if it is an armstrong number of not

//153 -> true
//578 -> false
//1634 -> true

package Function;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
        printArmstrongNumbers(100, 500);
    }

    public static void printArmstrongNumbers(int low, int high) {

        for (int n = low; n <= high; n++) {
            boolean res = isArmstrong(n);
            if (res) {
                System.out.println(n);
            }
        }
    }

    public static boolean isArmstrong(int n) {
        // n=16
        int nod = countDigits(n);// 4
        int on = n;// 1634
        int sum = 0;// 4^4 + 3^4
        while (n > 0) {
            int rem = n % 10;// 3
            sum += Math.pow(rem, nod);// 3^4
            n = n / 10;
        }
        if (sum == on) {
            return true;
        } else {
            return false;
        }

    }

    public static int countDigits(int n) {
        int nod = 0;
        while (n > 0) {
            n = n / 10;
            nod++;
        }
        return nod;

    }

}
