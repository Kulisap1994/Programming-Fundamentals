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
public class SampleCode11 {

    public static void main(String[] args) {

        int sum = 1;
        for (int x = 2; x < 2; x++) {
            sum += 1;
            for (int y = 1; y < 2; y++) {
                for (int z = 1; z < 2; z++) {
                    sum += 1;
                }
            }
        }
        System.out.println("sum: " + sum);
    }
}
