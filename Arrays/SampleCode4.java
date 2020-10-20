/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode4 {

    public static void main(String[] args) {

        String[] schools = {"NU", "UP", "DLSU", "UE"};
        System.out.println("length of the array: " + schools.length);

        for (int position = 0; position < schools.length; position++) {
            System.out.println("school at position " + position);
            System.out.println("is " + schools[position]);
        }
    }
}
