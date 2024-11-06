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
public class tryingassessment {
    



    public static void main(String[] args) {
        // Créer un objet Scanner pour capturer les entrées utilisateur
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer la population initiale
        System.out.print("Entrez la population actuelle (en milliards, par exemple 8.2 pour 8.2 milliards): ");
        double currentPopulation = input.nextDouble() * 1_000_000_000; // Convertir en population totale

        // Demander à l'utilisateur d'entrer le taux de croissance
        System.out.print("Entrez le taux de croissance annuel (en pourcentage, par exemple 1.05 pour 1.05%): ");
        double growthRate = input.nextDouble(); // Lire le taux de croissance

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
        
        // Fermer le scanner
        input.close();
    }
}

