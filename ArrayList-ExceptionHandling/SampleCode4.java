/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.Scanner;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode4 {

    public static void main(String[] args) {

        try {
            //codes here to be executed

            //ask for user input
            Scanner input = new Scanner(System.in);
            System.out.println("Input number, baby <3");
            int input_number = input.nextInt();
            System.out.println("The value is: " + input_number);

        } catch (Exception error_name) {
            // what will you do when error occurs?

            System.out.println("THERE IS SOMETHING WRONG WITH THE INPUT");
        }

    }
}
