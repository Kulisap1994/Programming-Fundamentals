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
public class Solution1 {

    public static void main(String[] args) {
        /**
         * Given an array of ints, return true if the sequence of numbers 1, 2,
         * 3 appears in the array somewhere.
         *
         */
        int[] testCaseOne = {1, 1, 2, 3, 1};
        boolean output = hasSequence(testCaseOne);
        System.out.println("test case one: " + output);

        int[] testCaseTwo = {1, 1, 2, 4, 1};
        output = hasSequence(testCaseTwo);
        System.out.println("test case one: " + output);

        int[] testCaseThree = {1, 1, 2, 1, 2, 3};
        output = hasSequence(testCaseThree);
        System.out.println("test case one: " + output);
    }

    public static boolean hasSequence(int[] sequence) {

        // Naive implementation of the answer.
        // The goal of this method is to make all the booleans true if 1, 2, 3 
        // exists in the sequence.
        boolean one = false;
        boolean two = false;
        boolean three = false;

        for (int element : sequence) {
            if (element == 1) {
                one = true;
            }
            if (element == 2) {
                two = true;
            }
            if (element == 3) {
                three = true;
            }
        }

        // If 1, 2, or 3, does not exists in the sequence. Automatically, this
        // will return false. RECALL the LOGICAL 'AND'.
        return (one && two && three);
    }
}
