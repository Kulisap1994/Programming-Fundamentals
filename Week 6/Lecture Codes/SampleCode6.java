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
public class SampleCode6 {

    public static void main(String[] args) {
        
        // Infite loop since the value of the variable 'counter' is decreasing.
        // It will never go beyond 2 because of the 'counter--' in the loop.
        for (int counter = 2; counter < 6; counter--) {

            System.out.println("the value of counter = " + counter);
        }
    }
}
