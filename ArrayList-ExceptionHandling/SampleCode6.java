/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode6 {

    public static void main(String[] args) {
        try {
            addValues(3, 3);
        } catch (Exception e) {
        }
    }

    public static void addValues(int x, int y) throws CustomizedException {

        //code here.
    }
}

class CustomizedException extends Exception {
}
