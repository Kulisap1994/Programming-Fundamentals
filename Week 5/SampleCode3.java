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
public class SampleCode3 {

    public static void main(String[] args) {
        int counter = 46;

        // Check all values from 46 to 100.
        while (counter <= 100) {

            // Check if each counter value is divisible by 2.
            if (counter % 2 == 0) {

                // Print counter if divisible by 2.
                System.out.println("even at: " + counter);
            }

            counter++; //always remember to put an increment/decrement
        }
    }
}
