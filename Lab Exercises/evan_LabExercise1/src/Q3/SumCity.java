/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 6, 2023
 Description: This is question 3 of Lab Exercise 1 and the task of this question is to print the summation of numbers and characters using overloaded methods.
 ******************************/

package Q3;

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package
import Q1.MethodDemo;
//Imports the methods from Q1 into Q3

public class SumCity {
    //Creating a class named "SumCity" which Java will need to use in order to run the program

    /***** Defines the method sumValues as a String *****/

    public static String sumValues(String str1, String str2) {
        //Defines the method sumValues with two variables of "str1" and "str2"
        return str1 + str2;
        //Returns the summation of "str1" and "str2"
    }

    /***** Defines the method sumValues as a double *****/

    public static double sumValues(double num1, double num2) {
        //Defines the method sumValues with two variables of "num1" and "num2"
        return num1 + num2;
        //Returns the summation of "num1" and "num2"
    }

    /***** Defines the method sumValues as a char *****/

    public static char sumValues(char char1, char char2) {
        //Defines the method sumValues with two variables of "char1" and "char2"
        return (char) (char1 + char2);
    }

    /***** Driver method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method
        MethodDemo.myHeader(1, 2, "The task of this question is to print the summation of numbers and characters using overloaded methods.");
        //Calls my public static method "myHeader" from Q1 MethodDemo

        /***** Prompts the user to enter two real numbers and returns their respective sum *****/

        Scanner input = new Scanner(System.in);
        //Prepares a Scanner type reference variable/object to input a value from the standard input
        System.out.println();
        //Prints an empty line on the user's standard output
        System.out.println("Enter a real number: ");
        //Prompts the user to enter a real number on their standard input
        double num1 = input.nextDouble();
        //Assigns the user's inputted value to the variable "num1" as a double
        System.out.println("Enter a second real number: ");
        //Prompts the user to enter a real number on their standard input
        double num2 = input.nextDouble();
        //Assigns the user's inputted value to the variable "num2" as a double
        System.out.printf("The sum of %.2f and %.2f is %.2f", num1, num2, sumValues(num1, num2));
        //Prints the user's two real numbers and its sum using the printf() method

        System.out.println();
        //Prints an empty line on the user's standard output
        System.out.println("Enter a character: ");
        //Prompts the user to enter a character on their standard input
        char char1 = input.next().charAt(0);
        //Assigns the user's inputted character to the variable "char1" as a char
        System.out.println("Enter a second character: ");
        //Prompts the user to enter a character on their standard input
        char char2 = input.next().charAt(0);
        //Assigns the user's inputted character to the variable "char2" as a char
        int charInt = sumValues(char1, char2);
        //Assigns the sum of "char1" and "char2" to the variable "charInt" as an int
        System.out.printf("The sum of %c and %c is %c, whose equivalent integer value is %d", char1, char2, sumValues(char1, char2), charInt);
        //Prints the user's two characters, its sum, and integer equivalent using the printf() method

        System.out.println();
        //Prints an empty line on the user's standard output
        Scanner scanner = new Scanner(System.in);
        //Prepares a Scanner type reference variable/object to input a value from the standard input
        String str1 = ("My name is ");
        //Assigns "str1" with the literal "My name is "
        System.out.println("Enter your full name: ");
        //Prompts the user to enter their full name on their standard input
        String str2 = scanner.nextLine();
        //Assigns the user's inputted values to the variable "str2" as a String
        //scanner.nextLine() collects the user's entire input including spaces
        System.out.printf("%s", sumValues(str1, str2));
        //Prints the user's full name using the printf() method

        System.out.println();
        //Prints an empty line on the user's standard output
        System.out.println();
        //Prints an empty line on the user's standard output
        MethodDemo.myFooter(3);
        //Calls the myFooter() method from Q1 Method Demo
    }
}
