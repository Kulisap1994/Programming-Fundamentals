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
public class SampleCode {

    public static void main(String[] args) {
        try {
            // Location of the file in the computer.
            File fileName = new File("C:\\Users\\mvoctavianojr\\desktop\\dataset.txt");
            
            // Read the file using Scanner.
            Scanner sc = new Scanner(fileName);

            // Check if there is a line in the text file.
            while (sc.hasNextLine()) {
                // Read the current line
                String line = sc.nextLine();
                System.out.println("print line: " + line);
            }
            // Handles when there is an error. Example: FileNotFound Error.
        } catch (Exception e) {
            System.out.println("general error");
        }
    }
}
