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
public class SampleCode {

    public static void hello(int x) {
        System.out.println("here at hello() with count: " + x);
    }

    public static void main(String[] args) {
        for (int counter = 0; counter < 4; counter++) {
            if (counter % 3 == 0) {
                hello(counter);
            }
        }
    }
}
