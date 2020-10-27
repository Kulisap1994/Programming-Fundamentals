/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.problem.set;

/**
 *
 * @author mvoctavianojr
 */
public class Solution3 {

    public static void main(String[] args) {
        /**
         * Write a Java program to compute for the sum of values of an integer
         * array with size 5.
         */

        int[] testCaseOne = {1, 2, 9, 3, 4};
        displaySum(testCaseOne);

        int[] testCaseTwo = {1, 2, 3, 4, -9};
        displaySum(testCaseTwo);

        int[] testCaseThree = {-1, 0, 3, -4, -5};
        displaySum(testCaseThree);

    }

    // I just put the code in a method.
    // This makes my main method CLEANER.
    public static void displaySum(int[] sequence) {
        if (sequence.length < 5) {
            System.out.println("not size 5");
        } else {
            int sum = 0;
            for (int element : sequence) {
                sum += element;
            }
            System.out.println("sum: " + sum);
        }
    }
}
