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
public class SampleCode5 {

    public static void hello() {
        System.out.println("hello()");
    }

    public static void main(String[] args) {
        System.out.println("start of main");
        int number = 2;

        if (number == 2) {
            System.out.println("2");
        } else if (number == 3) {
            System.out.println("3");
        } else if (number == 4) {
            System.out.println("4");
        } else {
            System.out.println("beyond");
        }

        System.out.println("end of main");
    }

}
