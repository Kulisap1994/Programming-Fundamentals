/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    public static void main(String[] args) {

        // Using do-while.
        int counter = 1;
        // Execute all the codes inside the 'do block' before boolean test.
        do {
            // This is the body
            System.out.println("the value is: " + counter);
            counter = counter + 1;
        } while (counter <= 10);
    }
}
