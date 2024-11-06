/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment.pkg2;

/**
 *
 * @author yasmi
 */
public class tas4 {
   

    public static void main(String[] args) {
        // Pattern 1
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println(); // Blank line between patterns

        // Pattern 2
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Blank line between patterns

        // Pattern 3
        for (int i = 1; i <= 10; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            // Print asterisks
            for (int j = i; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Blank line between patterns

        // Pattern 4
        for (int i = 10; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            // Print asterisks
            for (int j = i; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


