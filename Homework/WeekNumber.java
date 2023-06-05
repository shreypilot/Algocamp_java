package Homework;

import java.util.Scanner;

public class WeekNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int weekNumber = scanner.nextInt();
        scanner.close();
        
        String dayOfWeek = getDayOfWeek(weekNumber);
        if (dayOfWeek != null) {
            System.out.println("Corresponding day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid week number!");
        }
    }

    public static String getDayOfWeek(int weekNumber) {
        switch (weekNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null;
        }
    }
}
