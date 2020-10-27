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
public class SampleCode1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int counter = 1; counter < arr.length; counter++) {
            arr[counter - 1] = counter + 2;
        }

        int sum = 3;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("sum: " + sum);
    }

}
