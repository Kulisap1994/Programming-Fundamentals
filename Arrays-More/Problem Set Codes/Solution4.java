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
public class Solution4 {

    public static void main(String[] args) {
        /**
         *
         * Write a Java program to find the index of an array element.
         */
        int[] testCaseOne = {1, 2, 9, 3, 4};
        int value_to_find = 9;
        int output = indexOf(testCaseOne, value_to_find);
        System.out.println("test case one: " + output);

        int[] testCaseTwo = {1, 2, 3, 4, -9};
        value_to_find = 0;
        output = indexOf(testCaseTwo, value_to_find);
        System.out.println("test case one: " + output);

        int[] testCaseThree = {-1, 0, 3, -4, -5};
        value_to_find = -5;
        output = indexOf(testCaseThree, value_to_find);
        System.out.println("test case one: " + output);
    }

    public static int indexOf(int[] sequence, int value) {

        // the index tracks the index.
        int index = 0;

        // this variable is a flagger whether the value exists or not.
        boolean isFound = false;

        for (int element : sequence) {

            // if the value is in the element. Stop the looping and flag that
            // the element is found.
            if (element == value) {
                isFound = true;
                break;
            }
            index++;
        }
        // return the index of the element if found. Otherwise, even after all
        // the element in the sequence is checked and the value is not found, 
        // return -1
        if (isFound) {
            return index;
        } else {
            return -1;
        }
    }
}
