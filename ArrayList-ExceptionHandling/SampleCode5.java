/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode5 {

    public static void main(String[] args) {

        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println("the array: " + array[1000]);
        } catch (Exception exception_name) {
            System.out.println("error is: " + exception_name);
            System.out.println("SHUTDOWN HAPPILY.");
        }
    }
}
