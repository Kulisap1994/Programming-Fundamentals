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
public class SampleCode4 {

    public static void main(String[] args) {
        int counter = 1;

        // This loop runs infinitely.
        // This is because counter is always 1.
        while (counter <= 1000) {
            System.out.println("value is : " + counter);

            //NOTE: intentionally, remove the increment/decrement part.
        }
    }
}
