/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode4 {

    public static void main(String[] args) {

        int increment = 1;
        System.out.println("increment: " + increment);

        // POST-INCREMENT is the same as:
        //      increment += 1
        //      increment = increment + 1
        increment++;
        System.out.println("add 1: " + increment);

        // PRE-INCREMENT is the same as:
        //      increment += 1
        //      increment = increment + 1
        ++increment;
        System.out.println("add 1: " + increment);

        // =================================================
        // =================================================
        // =================================================
        // Other application of the two increment that makes them different
        //
        //
        int x = 1;
        // Get the value of x. Then, store the value to y. Last, increment x.
        int y = x++;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        int a = 2;
        // Increment a. Then, get the NEW value of a. Last, store to b.
        int b = ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
