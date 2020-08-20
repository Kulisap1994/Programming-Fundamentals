/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author mvoctavianojr
 */
public class FirstProgram {

    // This is the main method that Java always look when a program runs.
    // If you want to run the program, just copy the content  of the main.
    public static void main(String[] args) {

        // START COPY
        System.out.println("This is my first print");

        int number = 1;
        int anotherNumber = 2;
        int sum = number + anotherNumber; // This line adds the two variables.

        System.out.println("The sum is: " + sum); // We use '+' to merge the String and the Integer.

        // END COPY
    }
}
