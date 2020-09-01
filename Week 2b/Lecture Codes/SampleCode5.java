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
public class SampleCode5 {

    /**
     * LOGICAL AND
     * True and True = True
     * True and False = False
     * False and True = False
     * False and False = False
     * 
     * 
     * LOGICAL OR
     * True or True = True
     * True or False = True
     * False or True = True
     * False or False = False
     * 
     * 
     * LOGICAL NOT
     * !TRUE = FALSE
     * !FALSE = TRUE
     */
    public static void main(String[] args) {
        
        int x = 1;
        int y = 2;
        
        // Same as evaluating:
        //                 (1 < 2) && (1 != 2)
        //                 (ONE less than 2) AND (ONE is not equal to TWO)
        boolean evaluate = (x < y) && (x != y); 
        System.out.println("evaluate: " + evaluate);
        
        // Same as evaluating:
        //                  !(3 == 2)
        //                  REVERSE THE BOOLEAN OF: (THREE is equal to TWO)        
        boolean evaluateAgain = (!(3 == y));
        System.out.println("evaluateAgain: "+evaluateAgain);
    }
}
