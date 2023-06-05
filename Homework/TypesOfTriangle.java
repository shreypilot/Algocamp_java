package Homework;

import java.util.Scanner;

public class TypesOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        scanner.close();

        if (isScalene(a, b, c)) {
            System.out.println("The triangle is scalene.");
        } else if (isEquilateral(a, b, c)) {
            System.out.println("The triangle is equilateral.");
        } else if (isIsosceles(a, b, c)) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is neither scalene, equilateral, nor isosceles.");
        }
    }

    public static boolean isScalene(double a, double b, double c) {
        return (a != b && b != c && a != c);
    }

    public static boolean isEquilateral(double a, double b, double c) {
        return (a == b && b == c);
    }

    public static boolean isIsosceles(double a, double b, double c) {
        return (a == b || b == c || a == c);
    }
    
}
