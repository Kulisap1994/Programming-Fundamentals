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
public class SampleCode2 {

    public static void main(String[] args) {

        // IMPLICIT CASTING: Java automatically converts the data type.
        int i = 3;
        double d;

        d = i;

        // =============================================
        // =============================================
        // =============================================
        // EXPLICIT CASTING: You need to tell java that you want them to convert.
        double a = 3.2;
        int b;

        // This will give you error.
        // b = a;
        // define the data type before the variable that you want to cast.
        b = (int) a;
    }
}
