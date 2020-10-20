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
public class SampleCode7 {

    public static void main(String[] args) {
        int[][] list = {
            {1,2,3}, // list[0] 
            {5,2,3,5,7}, //list[1]
            {13,2,54,2} //list[2]
        };
        
        
        System.out.println(list[0].length);
        System.out.println(list[1].length);
        System.out.println(list[2].length);
        
        // I want to access 13.
        System.out.println(list[2][0]);
    }
}
