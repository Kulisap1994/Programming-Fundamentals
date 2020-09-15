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
public class Solution2 {

    // This is the solution for the conversion part of Activity 3.1.A
    // NOTE: Test case output on the activity is wrong.
    // Sorry. :D
    // This is the correct output
    public static void main(String[] args) {
        System.out.println("Test Case 1: "+ average(81.20, 0.75, 3.25));
        System.out.println("Test Case 2: "+ average(100.11, 39.02, 88.75));
                
    }

    public static double average(double a, double b, double c) {
        double average = (a + b + c) / 3;
        return average;
    }
    
    
}
