/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.problem.set;

/**
 *
 * @author mvoctavianojr
 */
public class Solution {

    // This is the solution for the conversion part of Activity 2
    public static void main(String[] args) {
        double pi = 3.14;
        double r = 1;
        double n = 1;
        double s = 1;

        // This is the use of Math.pow(x, y). For example,
        // Math.pow(2,3) = 2 * 2 * 2  
        double first_term_numerator = pi * 2 * (Math.pow(r, (2 / 3)));
        double first_term_denomenator = 2 * (Math.pow(n, 3));
        double first_term = (first_term_numerator / first_term_denomenator) + 2;

        double second_term_first_parenthesis = (Math.pow(s, 0.5) / 4) + 2; // 1/2 = 0.5
        double second_term_second_parenthesis = (Math.pow(2, 0.5) / 3);
        double second_term = 3 + (second_term_first_parenthesis * second_term_second_parenthesis);
        
        double complete_equation = first_term / second_term;
    }
}
