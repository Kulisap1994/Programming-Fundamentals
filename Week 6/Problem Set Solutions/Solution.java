/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.problem.set;

/**
 *
 * @author mvoctavianojr
 */
public class Solution {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 2;

        int sum = 3;

        for (int counter = 1; counter < 5; counter++) {
            a = a + b;
            c *= 2;
            sum += sum - c + b;
            System.out.println("a: " + a);
        }

        System.out.println("sum: " + sum);
    }

}
