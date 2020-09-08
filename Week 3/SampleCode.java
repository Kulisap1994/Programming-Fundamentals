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
public class SampleCode {

    // This is a method with NO parameter and NO return.
    public static void display() {
        System.out.println("this code is inside the display()");
        System.out.println("Print me, baby");
    }

    // This is a method with parameter and NO return.
    public static void displayMyName(String name) {
        System.out.println("Your name is: " + name);
    }

    // This is a method with PARAMETER and RETURN.
    public static int addNumbers(int number1, int number2) {

        int sum = 0;
        sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {
        display(); // This will execute the display()
        displayMyName("Manolito");
        
        int total = addNumbers(5, 2);
        System.out.println("total: " + total);
    }

}
