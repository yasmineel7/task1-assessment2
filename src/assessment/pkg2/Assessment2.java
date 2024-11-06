/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assessment.pkg2;
import java.util.Scanner;
/**
 *
 * @author yasmi
 */
public class Assessment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%-7s %-7s %-7s%n", "Side 1 ", "Side 2 ", "Hypotenuse");
     
        // Loop 
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {  
                for (int hypotenuse = side2; hypotenuse <= 500; hypotenuse++) {  
                    //  Pythagorean triple
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        // Display the result
                        System.out.printf("%-7d %-7d %-7d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}

        
    
    

