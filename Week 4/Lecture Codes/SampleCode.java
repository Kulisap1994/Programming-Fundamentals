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
public class SampleCode {

    public static void main(String[] args) {
        int input = 1;
        System.out.println("start of switch");
        switch (input) {
            case 1: // IF input == 1
                System.out.println("HELLO");
                break;
            case 2: // ELSE IF input == 2
                System.out.println("HI");
                break;
            case 3: // ELSE IF input == 3
                System.out.println("INSIDE 3");
                break;
            default: // ELSE
                System.out.println("SAME as default");
        
        }
        System.out.println("end of switch");
    }

}
