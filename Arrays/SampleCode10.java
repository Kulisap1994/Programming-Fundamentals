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
public class SampleCode10 {

    public static void shapeDeterminer(int[][] array) {

        int row = array.length;
        int column = array[1].length;

        if (row == column) {
            System.out.println("SQUARE ARRAY/MATRIX");
        } else if (row < column) {
            System.out.println("...");
        }

    }

    public static void main(String[] args) {
        int[][] arrayExam = {
            {1, 2},
            {5, 6}
        }; // 2 x 2, arrayExam[0][1]
        shapeDeterminer(arrayExam);
    }
}
