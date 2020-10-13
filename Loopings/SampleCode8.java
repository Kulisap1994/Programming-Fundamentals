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
public class SampleCode8 {

    public static void main(String[] args) {

        int x = 1;
        int y = 3;
        while (x != 3) {
            y = 1;
            while (y < 3) {
                System.out.println("x: " + x);
                y++;
            }
            y++;
        }
    }
}
