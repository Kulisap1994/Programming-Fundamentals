/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode7 {

    public static void main(String[] args) {

        int sum = 0;
        for (int counter = 0; counter < 3; counter++) {

            for (int inside = 0; inside < counter; inside++) {

                sum = sum + 1;
            }
            
        }
        System.out.println("sum: " + sum);
    }
}
