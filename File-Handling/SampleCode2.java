/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mvoctavianojr
 */
public class SampleCode2 {

    public static void main(String[] args) {
        try {
            File fileName = new File("C:\\Users\\mvoctavianojr\\desktop\\dataset.txt");
            Scanner sc = new Scanner(fileName);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                // Split the line per word/character using the delimeter space.
                String[] perWord = line.split(" ");// {4,5,6}

                int sum = 0;
                // Get each element of the array
                for (String word : perWord) {
                    // Convert the string into integer
                    sum += Integer.parseInt(word); // sum = sum + number
                }
                System.out.println("the sum: " + sum);

            }
            // Specific error
        } catch (FileNotFoundException fileError) {
            System.out.println("there is an error in error");
        } //General error. 
        catch (Exception e) {
            System.out.println("general error");
        }
    }
}
