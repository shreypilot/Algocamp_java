package Homework;
import java.util.Scanner;

public class RootsOfQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the coefficient of x^2 (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the coefficient of x (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the constant term (c): ");
        double c = scanner.nextDouble();
        
        scanner.close();
        
        double[] roots = solveQuadraticEquation(a, b, c);
        
        if (roots == null) {
            System.out.println("No real roots exist for the given quadratic equation.");
        } else if (roots.length == 1) {
            System.out.println("The quadratic equation has one real root: " + roots[0]);
        } else {
            System.out.println("The quadratic equation has two real roots: " + roots[0] + " and " + roots[1]);
        }
    }
    
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant < 0) {
            return null; // No real roots
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root}; // One real root
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2}; // Two real roots
        }
    }
}