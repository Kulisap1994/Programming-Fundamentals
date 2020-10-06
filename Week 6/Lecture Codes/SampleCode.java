/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String love = "";

        System.out.println("Do you love me? YES or NO");
        // This part gets user input.
        love = input.nextLine();

        int counter = 0;
        
        // This part checkes whether love == "yes". However, we do not use 
        // the '==' when we compare String.
        // Furthermore, this part ignores the casing of the characters.
        while (love.equalsIgnoreCase("yes")) {
            counter++;
            System.out.println("I LOVE YOU " + counter + " times");

            System.out.println("Do you love me? YES or NO");
            love = input.nextLine();

            // If the boolean test is true here.
            // Java will exit the loop because of the 'break' keyword.
            if (love.equalsIgnoreCase("no")) {
                System.out.println("SO SAD.");
                break;
            }
        }
    }

}
