/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int count = 3;
        int anotherCount;

        anotherCount = 10;

        // prints String
        System.out.println("count");
        // prints the variable
        System.out.println(count);
        // prints the variable
        System.out.println(anotherCount);

        // change the value of the variable from 10 to 99.
        anotherCount = 99;
        System.out.println(anotherCount);

        // change the value of the variable from 99 to 3(same value with count).
        // Note: count is not affected.
        anotherCount = count;
        System.out.println(anotherCount);
        System.out.println(count);
    }
}
