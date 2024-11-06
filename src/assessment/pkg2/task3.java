/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment.pkg2;
import java.util.Scanner;

/**
 *
 * @author yasmi
 */
public class task3 {
 
 public static void main(String[] args) {
     //Create a new scanner object
       Scanner input = new Scanner(System.in);
        // variables
        int productNumber;
        int quantity;
        double totalRetailValue = 0.0;
      

        //loop
        while (true) {
            // Prompt the user to enter the product number
            System.out.print("Enter product number (1-5) or 0 to quit: ");
            productNumber = input.nextInt();

            // loop
            if (productNumber == 0) {
                break; 
            }

            //Prompt the user to enter the quantity sold
            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

          switch (productNumber) {
                case 1:
                    totalRetailValue += 2.98 * quantity;
                    break;
                case 2:
                    totalRetailValue += 4.50 * quantity;
                    break;
                case 3:
                    totalRetailValue += 9.98 * quantity;
                    break;
                case 4:
                    totalRetailValue += 4.49 * quantity;
                    break;
                case 5:
                    totalRetailValue += 6.87 * quantity;
                    break;
                
            }
        }

        // Display the result for the total retail value
        System.out.printf("Total retail value of all products sold: $%.2f%n", totalRetailValue);
    }
}
         


    
