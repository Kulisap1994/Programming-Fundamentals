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
public class SampleCode4 {

    public static void main(String[] args) {

        int counter = 4;
        
        // This gives an infinite loop because there is no change in the
        // variable 'counter'.
        do {
            System.out.println("the value of counter " + counter);
        } while (counter == 6);

    }

}
