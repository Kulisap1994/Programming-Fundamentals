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
public class Solution4 {

    public static void main(String[] args) {
        int sum = 0;
        for (int counter = 1; counter < 4; counter++) {
            for (int counter2 = 3; counter2 <= 4; counter2++) {
                sum += counter + counter2;
            }
        }
        System.out.println("sum" + sum);
    }

}
