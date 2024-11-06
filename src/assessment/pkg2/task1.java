/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment.pkg2;
import java.util.Scanner;
/**
 *
 * @author Yasmine El Hattab
 */
public class task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Créer un objet Scanner pour capturer les entrées utilisateur
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the World population calculator");
        // prompt the user to write the world population
        System.out.print("Enter the current world population: ");
        long currentPopulation = input.nextLong(); 

        //Prompt the user to write the growth rate
        System.out.print("Enter the current growth rate (e.g. 1.14% will be 0.0114): ");
        double growthRate = input.nextDouble();

        // Print table header
        System.out.printf("%-5s %-20s %-20s%n", "Year", "Anticipated Population", "Population Increase");

        // Loop through 75 years to calculate population growth
        for (int year = 1; year <= 75; year++) {
            double populationIncrease = (double)currentPopulation * growthRate;
            long newPopulation = currentPopulation + (long)populationIncrease;

            // Print year, anticipated population, and population increase
            System.out.printf("%2d %17d %17.0fd%n", year, newPopulation, populationIncrease);

            // Update current population for next year
            currentPopulation = newPopulation;
        }
        
        // 
        input.close();
    }
    }
    
/**
 *
 * @author yasmi
 */

