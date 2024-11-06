/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment.pkg2;

/**
 *
 * @author yasmi
 */
public class fillnew {
         public static void main(String[] args) {
        // Initial world population and growth rate
        double currentPopulation = 8000000000.0; // 8 billion
        double growthRate = 1.05; // Growth rate of 1.05%

        // Print table header
        System.out.printf("%-5s %-20s %-20s%n", "Year", "Anticipated Population", "Population Increase");

        // Loop through 75 years to calculate population growth
for (int year = 1; year <= 75; year++) {
            double populationIncrease = currentPopulation * (growthRate / 100);
            double newPopulation = currentPopulation + populationIncrease;

            // Print year, anticipated population, and population increase
            System.out.printf("%-5d %-20.0f %-20.0f%n", year, newPopulation, populationIncrease);

            // Update current population for next year
            currentPopulation = newPopulation;
        }
    }
}
       
    
