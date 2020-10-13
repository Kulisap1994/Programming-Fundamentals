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
public class SampleCode4 {

    public static void main(String[] args) {

        int sum = -2;
        for (int x = 0; x < 3; x++) {
            sum = sum + 2;
            if (x % 5 == 0) {
                sum = 0;
            }
        }
        System.out.println("sum: " + sum);
    }
}
