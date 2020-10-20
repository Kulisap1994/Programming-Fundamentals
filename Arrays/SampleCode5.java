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
public class SampleCode5 {

    public static void main(String[] args) {
        int[] numberList = {200, 400, 600, 800};

        // FIRST APPROACH
        for (int index = 0; index < numberList.length; index++) {
        if (index % 2 == 0) {
                System.out.println(numberList[index]);
            }
        }
        
        System.out.println("--------------");
        // SECOND APPROACH
        int counter = 0;
        for (int temp_variable : numberList) {
            if (counter % 2 == 0) {
                System.out.println(temp_variable);
            }
            counter++;
        }
    }
}
