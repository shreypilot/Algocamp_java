//In java , two or more methods may have the same name if they differ in parameters
//(different no of parameters, different types of parameters , or both)
//These methods are called overloaded methods and this feature is called method overloading

//void func(){...}
//void func(int a){...}
//void func(double a){...}
//void func(int a, float b){...}

//method overloaing is not associated with return types
//overloaded methods may have the same or different return types, but they must differ in parameters
package Function;

public class MethodOverloading {

    public static String formatNumber(int value) {
        return String.format("%d", value);
    }

    public static String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    public static String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        System.out.println(formatNumber(500));
        System.out.println(formatNumber(89.99999));
        System.out.println(formatNumber("555"));

    }
}
