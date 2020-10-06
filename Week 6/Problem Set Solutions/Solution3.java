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
public class Solution3 {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 2;

        int sum = 3;

        do {

            a += a;
            b += b;
            c = 1 / 2;
            sum++;
            System.out.println("b: " + b);
        } while (c == 0);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("sum: " + sum);
    }
}
