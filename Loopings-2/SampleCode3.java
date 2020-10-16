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
public class SampleCode3 {

    public static void main(String[] args) {
        int total = 2;
        for (int x = 0; x < 3; x++) {
            for (int y = 1; y < x; y++) {
                total += y + x; // total = total + y + x
                // counter += 1 ~ counter = counter + 1
            }
            // codes more here.
        }
        System.out.println("total: " + total);
    }
}
