/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    /**
     * More example of methods
     */
    public static int increment(int number) {
        int increased_value = ++number;
        return increased_value;
    }

    public static int addNumber(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static void formatDisplay(String input) {
        System.out.println("This is a formatted display of " + input);
    }

    public static void main(String[] args) {
        int first_number = increment(4); // This will give 5
        int second_number = increment(10); // This will give 11
        int sum = addNumber(first_number, second_number); // This will add the two numbers.
        formatDisplay(String.valueOf(sum)); // This part will type-cast integer to String.
    }
}
