/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: January 29, 2023
 Description: This is question 1 of Lab Assignment 1 and the task of this question is to be able to prompt the user to enter a four-digit number, print each number individually back to the user, and calculate the root-mean-square value of the four inputted digits.
 ******************************/

package Q1;

import java.util.Scanner; //Imports a pre-existing Scanner class into the program from the java.util package
public class MathBugs { //Creating a class named "MathBugs" which Java will need to use in order to run the program
    
    public static void main(String[] args) { //main() is used as an entry point in Java and all Java programs require a main method

        /***** Beginning text that the user will see on their standard output (computer monitor) *****/

        System.out.println("******************************************************");
        System.out.println("Full Name: Evan Van"); //Prints my name
        System.out.println("Student Number: 251287806"); //Prints my student number
        System.out.println("Date: January 29, 2023"); //Prints the date
        System.out.println("Brief description of the task: The task of this question is to be able to prompt the user to enter a four-digit number, print each number individually back to the user, and calculate the root-mean-square value of the four inputted digits."); //Prints a brief description of the task being accomplished in this question
        System.out.println("******************************************************");

        /***** Prompts the user to enter a four-digit number *****/

        Scanner input = new Scanner(System.in); //Prepares a Scanner type reference variable/object to input a value from the standard input (keyboard)
        System.out.println("Enter a four-digit number between 1111-9999 inclusive, without any zeros: "); //Prompts the user to enter a four-digit number between 1111-9999 inclusive, without any zeros
        int number = input.nextInt(); //Assigns the value the user inputted as variable "number"
        int thousandsDigit = number/1000; //Calculates the user's thousands place digit
        int hundredsDigit = (number%1000)/100; //Calculates the user's hundreds place digit
        int tensDigit = (number%100)/10; //Calculates the user's tens place digit
        int onesDigit = number%10; //Calculates the user's ones place digit

        /***** Displays each individual number the user inputted *****/

        System.out.println("Thousands Digit: " +thousandsDigit); //Displays the user's thousands place digit
        System.out.println("Hundreds Digit: " +hundredsDigit); //Displays the user's hundreds place digit
        System.out.println("Tens Digit: " +tensDigit); //Displays the user's tens place digit
        System.out.println("Ones Digit: " +onesDigit); //Displays the user's ones place digit

        /***** Calculates the root-mean-square of the four digits and displays the value to the user *****/

        double rootMeanSquared = Math.sqrt((Math.pow(thousandsDigit, 2) + Math.pow(hundredsDigit, 2) + Math.pow(tensDigit, 2) + Math.pow(onesDigit, 2))/4); //Calculates the root-mean-square of the four digits
        System.out.printf("The RMS value of the above four digits is: %.2f", rootMeanSquared); //Prints the user's RMS value and rounds the number to two decimal places using the "printf" method
        System.out.println();
        System.out.println("******************************************************");
    }
}