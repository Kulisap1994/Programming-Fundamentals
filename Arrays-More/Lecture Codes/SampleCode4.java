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
public class SampleCode4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] another = {7, 5, 9, 6};
        int sum = 1;
        
        for (int counter = 2; counter < another.length; counter++) {
            int temp = arr[counter - 2];
            arr[counter - 1] = another[counter - 1];
            another[counter - 1] = temp;
            sum += arr[counter - 1] + another[counter - 2];
        }
        System.out.println("sum: " + sum);
    }
}
