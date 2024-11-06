
import java.util.Scanner;

/**
 *
 * @author yasmi
 */


public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner input = new Scanner(System.in);

        // Display input prompt
        System.out.printf("Please enter a string with-inside:");
        String userInput = input.nextLine();

        // Capture user input
        System.out.printf("%-10s %10s", "User Input : ", userInput); input.nextLine();

        // Split the string into two substrings based on the '-'
        String[] parts = userInput.split("-", 2);  // Limit to 2 parts to handle the first '-'
        
        // Convert the first part to uppercase and the second part to lowercase
        String firstPart = parts[0].toUpperCase();
        String secondPart = parts[1].toLowerCase();
        
         // Display the original strings
        System.out.printf("%7s %1s", "Original String 1 : ", firstPart); input.nextLine();
        System.out.printf("%7s %1s", "Original String 2 : ",secondPart); input.nextLine();
        
        // Join the two parts together with "---" in between, second part first
        String formattedString = String.format("%s---%s", secondPart, firstPart);
        
         // Display the joined string
        System.out.printf("%-10s %10s", "Joined String : ", formattedString); input.nextLine();
        
        // Switch the first and last characters of the entire string
        char firstChar = formattedString.charAt(0);
        char lastChar = formattedString.charAt(formattedString.length() - 1);

        // Construct the new string with the first and last characters switched
       String finalString = lastChar + formattedString.substring(1, formattedString.length() - 1) + firstChar;

        // Display the final string
        System.out.printf("%-10s %-10s", "Final String: ", finalString); 
    }
