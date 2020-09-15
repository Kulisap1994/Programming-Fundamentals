/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.problem.set;

/**
 *
 * @author mvoctavianojr
 */
public class Solution4 {

    public static void main(String[] args) {
        System.out.println("Test Case 1: " + highestNumber(1, 2, 3));
        System.out.println("Test Case 2: " + highestNumber(3, 3, 3));
        System.out.println("Test Case 3: " + highestNumber(-1, -2, -3));

    }

    public static int highestNumber(int a, int b, int c) {

        // Compare the 3 values and return the sum if true.
        if (a == b && b == c) {
            int sum = a + b + c;
            return sum;
            //NOTE: codes beyod this 'return' will be considered error.
            //System.out.println("This part of code is error.");
        }
        // NOTE: In this part, the if-block on the top has a chance to fail.
        // Thus, java still needs to ask for a 'return'.
        // That is why, codes OUTSIDE the if-block is okay.

        // First, compare 'a' and 'b'.
        int temporary_value = Math.max(a, b);
        // Then, compare c to the returned value from the previous code.
        int highest = Math.max(temporary_value, c);

        return highest;

    }
}
