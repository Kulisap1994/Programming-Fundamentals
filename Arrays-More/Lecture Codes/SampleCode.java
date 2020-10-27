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
public class SampleCode {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4}, // index  0
                       {5, 6, 7, 8}, // index  1
                       {9, 10, 11, 12}}; // index 2
        System.out.println("arr.length: "+arr.length);
        int sum = 0;
        for (int counter = 0; counter < arr.length; counter++) {
            for (int x = 0; x < 2; x++) {
                sum += arr[counter][x]; // sum = sum + arr[counter][x]
            }
        }
        System.out.println("sum: " + sum);
    }
}
