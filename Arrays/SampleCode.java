/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode {

    public static void main(String[] args) {
        int arraySize = 10;
        int[] numberArray = new int[arraySize];

        // Storing values in array
        for (int counter = 0; counter < 2; counter++) {
            numberArray[counter] = counter * 2;
        }
        
        // Accessing specific value in array
        System.out.println(numberArray[3]);
    }
}
