/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 2;
        int sum = 0;
        while (counter < arr.length) {
            sum += 2 - arr[counter - 2];
            counter++;
            arr[counter - 1] = 2;
        }
        System.out.println("sum: " + sum);
    }
}
