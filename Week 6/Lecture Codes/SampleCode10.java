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
public class SampleCode10 {

    public static void main(String[] args) {

        // Use of for-loop.
        // The tricky part here is that the variable 'counter'
        // is also updated inside the body ASIDE 
        // from its update in the for(;;UPDATE)
        for (int counter = 1; counter < 10; counter += 2) {
            System.out.println("counter at: " + counter);
            counter = counter + 1;
        }
    }
}
