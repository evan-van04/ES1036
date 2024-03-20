/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: January 29, 2023
 Description: This is question 3 of Lab Assignment 1 and the task of this question is to calculate the weighted grade of a course that has three assignments.
 ******************************/

package Q3;

import java.util.Scanner; //Imports a pre-existing Scanner class into the program from the java.util package

public class CourseGradeCalculation { //Creating a class named "CourseGradeCalculation" which Java will need to use in order to run the program
    public static void main(String[] args) { //main() is used as an entry point in Java and all Java programs require a main method

        /***** Beginning text that the user will see on their standard output (computer monitor) *****/

        System.out.println("******************************************************");
        System.out.println("Full Name: Evan Van"); //Prints my name
        System.out.println("Student Number: 251287806"); //Prints my student number
        System.out.println("Date: January 29, 2023"); //Prints the date
        System.out.println("Brief description of the task: The task of this question is to calculate the weighted grade of a course that has three assignments."); //Prints a brief description of the task being accomplished in this question
        System.out.println("******************************************************");

        /***** Declaring the three constant grade weights *****/

        final double GRD1_WGT = 0.2; //Declares the constant GRD1_WGT to have a non-changeable value of 0.2 by using the variable "final"
        final double GRD2_WGT = 0.3; //Declares the constant GRD2_WGT to have a non-changeable value of 0.3 by using the variable "final"
        final double GRD3_WGT = 0.5; //Declares the constant GRD3_WGT to have a non-changeable value of 0.5 by using the variable "final"

        /***** Prompts the user to input 3 assignment marks *****/

        Scanner input = new Scanner(System.in); //Prepares a Scanner type reference variable/object to input a value from the standard input (keyboard)
        System.out.println();
        System.out.println("Input the first grade: "); //Prompts the user to input their first grade
        double grade1 = input.nextDouble(); //Assigns the value inputted by the user to variable "grade1"
        System.out.println("Input the second grade: "); //Prompts the user to input their second grade
        double grade2 = input.nextDouble(); //Assigns the value inputted by the user to variable "grade2"
        System.out.println("Input the third grade: "); //Prompts the user to input their third grade
        double grade3 = input.nextDouble(); //Assigns the value inputted by the user to variable "grade3"
        System.out.println();

        /***** Calculates the user's weighted average among the 3 assignments to 2 decimal places *****/

       double finalGrade = grade1*GRD1_WGT+grade2*GRD2_WGT+grade3*GRD3_WGT; //Calculates the user's weighted average among the 3 assignments
       System.out.printf("The course grade is: %.2f", finalGrade); //Prints the user's final grade rounded to 2 decimal places
        System.out.println();
        System.out.println("******************************************************");
    }
}
