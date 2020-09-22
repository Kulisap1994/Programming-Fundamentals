/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode {

    public static void main(String[] args) {

        // Initialized a value.
        int counter = 0;

        // This is the syntax of the while loop:
        // while(boolean test){ 
        //         your codes here
        //    }
        while (counter < 5) {
            System.out.println("print counter at: " + counter);

            // Increment the value of counter.
            // NOTE: You may increment by 5 if you want.
            counter = counter + 1;

            // If there is code to be executed.
            // Java will again go back to the '(boolean test)' of while loop.
            // And, recheck the new value of counter.
        }

        // When the '(boolean test)' of while loop fails.
        // Java will go out of the while loop and execute the rest of the code.
        System.out.println("done at counter: " + counter);
    }

}
