/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    public static void main(String[] args) {

        // Initialized a value.
        int counter = 1;

        // Print all numbers from 1 to 10.
        // NOTE: '(counter < 10)' in the loop is different from '(counter <=10)'
        while (counter <= 10) {
            System.out.println("value: " + counter);
            
            // Always remember to put this. 
            counter = counter + 1; // This is the same as counter++;
        }
    }
}
