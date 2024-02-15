// Import the Scanner class from the java.util package
import java.util.*;

public class AverageGrade {
    // Define a public static method named main with a parameter of type String array
    public static void main(String[] args) {
        // Create a new Scanner object called scan to read input from the user
        Scanner scan = new Scanner(System.in);
        // Prompt the user to enter the number of students in the class
        System.out.println("Enter the number of students: ");
        int n = scan.nextInt();
        // Create an array of doubles called grades with the same size as the number of students
        double[] grades = new double[n];
        // Use a for loop to prompt the user to enter each student's grade
        for (int i = 0; i < n; i++) {
            System.out.println("Enter grade " + (i+1) + ": ");
            // Use the nextDouble() method of the Scanner object to read the input and store it in the corresponding element of the grades array
            grades[i] = scan.nextDouble();
        }
        // Calculate the average by summing all the grades and dividing by the number of students
        double avg = 0;
        for (double grade : grades) {
            avg += grade;
        }
        avg /= n;
        // Print the average grade to the console
        System.out.println("The average grade is: " + avg);
        // Close the Scanner object
        scan.close();
    }
}