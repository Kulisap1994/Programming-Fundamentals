/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode3 {

    public static void main(String[] args) {
        // This is a conditional expression.
        int x = (4 > 5) ? 2 : 7;

        //The conditional expression above is same as if-else block below.
        if (4 > 5) {
            x = 2;
        } else {
            x = 7;
        }

        System.out.println("x: " + x);
    }

}
