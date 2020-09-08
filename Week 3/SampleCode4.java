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
public class SampleCode4 {

    public static void displayHello() {
        System.out.println("inside hello()");
    }

    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 4;

        // This is the first if-else-block. Java will executes the code inside
        // the if-block if the condition is True, otherwise, it will execute the
        // codes inside the else.
        if (number1 == number2) {
            System.out.println("The code inside 1st if block.");
        } else {
            displayHello();
        }

        // This is the second if-else-block. Java will test the condition because
        // the first if-block is not related to the second if-else-block.
        if (number1 <= 20) {
            System.out.println("The code inside 2nd if block.");
        }
    }
}
