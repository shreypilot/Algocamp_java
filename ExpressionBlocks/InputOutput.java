package ExpressionBlocks;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args){

   
        // System.out.println("hello");

        // int val = 5;
        // System.out.println(val);
        // System.out.println(5);
        // System.out.println("I AM" + "AWESOME AT PROGRAMMING");
        // System.out.println("number = " + val);

        //create an object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        //take input from user
        int number = input.nextInt();

        System.out.println("You Entered " + number);

        float myFloat = input.nextInt();

        System.out.println("You Entered " + myFloat);

        String myString = input.next();

        //next() ->read a word from the user
        //nextLine() ->read a line of text from user

        /*
         * String NAME = next()->hello my name: read only hello
         * String NAME = nextLine()->hello my name: read whole line code
         */
       



    }
    
}
