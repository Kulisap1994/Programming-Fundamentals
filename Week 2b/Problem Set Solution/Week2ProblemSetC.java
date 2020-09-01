/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.set;

/**
 *
 * @author mvoctavianojr
 */
public class Week2ProblemSetC {

    public static void main(String[] args) {
        // Problem set C:
        // Always put the variables on top so that you can track errors fast.

        double pi = 3.14;
        int r = 1;
        int f = 12;
        int s = 12;
        // First part of the equation
        double first_term = ((pi * (r * r)) / f * f * f * f) + 2;

        // Second part of the equation. However, I further separate it.
        double second_term_part_A = ((s * s) / 4) + 2;
        double second_term = second_term_part_A * (2 / 3);

        // Combine the first and second part.
        double final_value = first_term + second_term;
    }
}
