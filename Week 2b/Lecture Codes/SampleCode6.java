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
public class SampleCode6 {

    public static void main(String[] args) {
        System.out.println("Inside main()");
        // Call and execute codes in greet()
        greet();
        System.out.println("Inside main()");
        // Call and execute codes in addSpecificNumber()
        addSpecificNumber();
    }

    public static void greet() {
        System.out.println("hello I'm inside greet()");
    } // When all codes done executing in the greet(), it will go back to main()

    public static void addSpecificNumber() {
        int x = 1;
        int y = 2;

        System.out.println("The sum is: " + (x + y));
    }// When all codes done executing in the addSpecificNumber(), it will go back to main()
}
