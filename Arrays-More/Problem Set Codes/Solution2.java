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
public class Solution2 {

    public static void main(String[] args) {
        /**
         *
         * Given an array of ints, return true if one of the first 4 elements in
         * the array is a 9. The array length may be more than 4.
         */
        int[] testCaseOne = {1, 2, 9, 3, 4};
        boolean output = firstFour(testCaseOne);
        System.out.println("test case one: " + output);

        int[] testCaseTwo = {1, 2, 3, 4, 9};
        output = firstFour(testCaseTwo);
        System.out.println("test case one: " + output);

        int[] testCaseThree = {1, 2, 3, 4, 5};
        output = firstFour(testCaseThree);
        System.out.println("test case one: " + output);
    }

    public static boolean firstFour(int[] sequence) {

        boolean containsNine = false;

        // The loop is limited to the first four element of the array.
        for (int counter = 0; counter < 4; counter++) {

            // If within the first 4, the value 9 found, make the boolean true.
            if (sequence[counter] == 9) {
                containsNine = true;
            }
        }

        return containsNine;
    }
}
