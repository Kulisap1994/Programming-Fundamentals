/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    public static void main(String[] args) {

        //NOTE: Java will execute all codes after a case until 
        // a 'break' is present.
        int input = 1;
        System.out.println("start of switch");
        switch (input) {
            case 1: // IF input == 1
                System.out.println("HELLO");

            case 2: // ELSE IF input == 2
                System.out.println("HI");

            case 3: // ELSE IF input == 3
                System.out.println("INSIDE 3");
                break;
            default: // ELSE
                System.out.println("SAME as default");

        }
        System.out.println("end of switch");
    }
}
