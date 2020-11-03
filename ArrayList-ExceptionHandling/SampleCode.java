/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode {

    public static void main(String[] args) {

        ArrayList<String> theList = new ArrayList<String>();

        theList.add("Mano");
        theList.add(1, "CAT");
        theList.add("LITO");
        theList.add("DOG");
        
        int temp_last_value = theList.size() - 1;
        System.out.println(theList.get(temp_last_value));
        //for (String value : theList) {
        //    System.out.println("the value: " + value);
        // }
        //for (int counter = 0; counter < theList.size(); counter++) {
        //    System.out.println("the value: "+theList.get(counter));
        //}
    }

}
