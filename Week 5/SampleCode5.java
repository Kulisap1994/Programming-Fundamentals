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
public class SampleCode5 {

    public static void main(String[] args) {
        
        // This is the hint for one 'pre-league' question on the exam. :D
        // Locate where to add the sum.
        int counter = 0;

        while (counter < 1000) {

            // multiples of 3 OR 5.
            if (counter % 3 == 0 || counter % 5 == 0) {

                // Ignore if number is multiples of 6.
                if (counter % 6 == 0) {
                    //ignore
                } else {

                    // number is multiples of 3 OR 5 BUT NOT 6.
                    System.out.println("counter: " + counter);
                }
            }

            counter++;
        }
    }
}
