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
public class SampleCode8 {

    public static void main(String[] args) {
        int[][] list = {
            {1, 2, 3}, // list[0] 
            {5, 2, 3, 5, 7}, //list[1]
            {13, 2, 54, 2} //list[2]
        };

        // Getting the OVERALL NUMBER OF ELEMENTS in the 2-d array.
        System.out.println(list.length);

        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.println(list[row][column]);
            }
            // EXECUTE REMAINING CODES.
        }
    }
}
