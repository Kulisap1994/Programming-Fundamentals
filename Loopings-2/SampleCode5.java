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
public class SampleCode5 {

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        int g = 2;

        for (int counter = 1; counter < 3; counter++) {
            int temp = sum(counter, g);
            if (temp > (g * 3)) {
                break;
            }
            System.out.println(counter);
            System.out.println(temp);
        }

        for (int z = 2; z < 6; z++) {
            System.out.print(z+ " ");
        }
        
        // executes if there are any.
    }
}
