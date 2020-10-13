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
public class SampleCode10 {

    public static void main(String[] args) {
        int counter = 0;
        int y = 1;
        while (true) {
            y++;
            while (true) {
                counter++;
                if (counter == 3) {
                    break;
                }
            }
            if (y == 2) {
                break;
            }
        }
        System.out.println("counter: " + counter);
        System.out.println("y:" + y);
    }

}
