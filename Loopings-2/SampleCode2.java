/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.optional;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    public static void main(String[] args) {
        int counter = 2;
        int fine = 3;
        while (counter < 5) {
            fine = 3;
            while (counter <= 5) {
                fine++;
                counter = fine;
            }
            System.out.println("counter: " + counter);
        }
        System.out.println("fine: " + fine);
    }
}
