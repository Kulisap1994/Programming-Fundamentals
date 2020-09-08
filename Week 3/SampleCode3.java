/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode3 {

    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 4;

        // This is the first if-block.
        if (number1 == number2) {
            System.out.println("The code inside 1st if block.");
        }
        
        // This is the second if-block. Java will test the condition because.
        // the first if-block is not related to the second if-block.
        if (number1 <= 20) {
            System.out.println("The code inside 2nd if block.");
        }

    }

}
