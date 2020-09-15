/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.problem.set;

import java.util.Scanner;

/**
 *
 * @author mvoctavianojr
 */
public class Solution3 {

    // This is the solution for the conversion part of Activity 3.2.A.
    // NOTE: makes a positive number negative and vise versa.
    public static void main(String[] args) {

        // Asking for USER INPUT.
        // You need to type: "import java.util.Scanner;" on the top.
        // check the code before the 'public class Solution3'
        Scanner input = new Scanner(System.in);
        System.out.println("Asking for user input: ");

        // This is the code that gets the user input. Convert to integer.
        // And, store on the userInput variable.
        int userInput = input.nextInt();

        String even_or_odd = isOdd(userInput);
      
        // Changing the sign of the value
        int temporary_value = userInput * -1;
        System.out.println(temporary_value + ", " + even_or_odd);
    }

    public static String isOdd(int number) {

        String value;

        // This part checks wheather the number is even or odd.
        if (number % 2 == 0) {
            value = "Even";
        } else {
            value = "Odd";
        }

        return value;
    }
}
