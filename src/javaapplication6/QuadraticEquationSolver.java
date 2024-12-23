/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;


/**
 *
 * @author alecn
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class QuadraticEquationSolver {

    
    public static void solve(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);
        
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
    
    public static boolean validateInput(String input) {
        try {
            Double.valueOf(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return false;
        }
    }

    
    public static void saveResults(String data) {
        try (FileWriter writer = new FileWriter("results.txt", true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            
            
            System.out.print("Enter coefficient a: ");
            input = scanner.nextLine();
            while (!validateInput(input)) {
                System.out.print("Enter coefficient a: ");
                input = scanner.nextLine();
            }
            double a = Double.parseDouble(input);
            
            System.out.print("Enter coefficient b: ");
            input = scanner.nextLine();
            while (!validateInput(input)) {
                System.out.print("Enter coefficient b: ");
                input = scanner.nextLine();
            }
            double b = Double.parseDouble(input);
            
            System.out.print("Enter coefficient c: ");
            input = scanner.nextLine();
            while (!validateInput(input)) {
                System.out.print("Enter coefficient c: ");
                input = scanner.nextLine();
            }
            double c = Double.parseDouble(input);
            
            System.out.println("Solving the quadratic equation...");
            solve(a, b, c);
            
            System.out.print("Do you want to save the results to a file (yes/no)? ");
            String saveToFile = scanner.nextLine();
            if (saveToFile.equalsIgnoreCase("yes")) {
                String result = "Equation: " + a + "x^2 + " + b + "x + " + c + " = 0";
                result += "\nThe roots are: " + ((b * b) - (4 * a * c) > 0 ? "real" : "complex") + "\n";
                saveResults(result);
                System.out.println("Results saved to results.txt.");
            }
        }
    }
}
   

