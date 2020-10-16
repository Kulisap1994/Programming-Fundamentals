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
public class SampleCode4 {

    public static int sum(int x) {
        int sum = x + x;
        return sum;
    }

    public static void main(String[] args) {
        int g = 2;

        for (int counter = 1; counter < 3; counter++) {
            int temp = sum(counter);
            if (temp > (g * 3)) {
                break;
            }
            System.out.println(counter);
            System.out.println(temp);
        }
    }
}
