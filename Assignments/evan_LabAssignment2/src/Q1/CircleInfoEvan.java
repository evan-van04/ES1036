/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 20, 2023
 Description: This is question 1 of Lab Exercise 2 and the task of this question is to prompt the user to input a radius value, and print that value along with its respective area, diameter, and circumference through the use of constructors.
 ******************************/

package Q1;
//Declares a package titled Q1, which groups the classes "Circle" and "CircleInfoEvan" into one folder

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package

public class CircleInfoEvan {
    //Creating a class named "CircleInfoEvan" which Java will need to use in order to run the program

    /***** Header Method *****/

    public static void myHeader(int labNum, int questionNum, String description) {
        //Defines a method called "myHeader" which contains 3 variables: "labNum", "questionNum", and "description"
        System.out.println("****************************************************");
        System.out.println("Full Name: Evan Van");
        //Prints my name as a literal
        System.out.println("Lab Assignment: " + labNum + ", Question: " + questionNum);
        //Prints the lab exercise and question number using variables "labNum" and "questionNum"
        System.out.println("Program Description: " + description);
        //Prints the description of the program using the variable "description"
        System.out.println("*****************************************************");
    }

    /***** Footer method *****/

    public static void myFooter(int questionNum) {
        //Defines a method called myFooter, containing the variable "questionNum" as an integer
        System.out.println("*** Signing off from Question " + questionNum + " – Evan ***");
        //Prints a concluding statement with the variable "questionNum"
    }

    /***** Driver method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method

        /***** Calls the header method *****/

        myHeader(2, 1, "The task of this question is to prompt the user to input a radius value, and print that value along with its respective area, diameter, and circumference through the use of constructors.");
        //Calls the method "myHeader" and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        /***** Circle type reference variable *****/

        Circle c = new Circle();
        //Creates a Circle type reference variable and instantiates the Circle object

        /***** Prompts the user to enter a radius value *****/

        Scanner input = new Scanner(System.in);
        //Prepares a Scanner type reference variable/object to input a value from the standard input
        System.out.println("Enter the radius: ");
        //Prints the message "Enter the radius: " to the user as a literal
        double radius = input.nextDouble();
        //Assigns the value the user inputted as variable "radius"

        /***** Prints the user's radius, area, diameter, and circumference *****/

        System.out.println("\nCircle info:");
        //Prints the message "Circle info: " to the user as a literal
        //Sets the radius of the circle using the setter method
        System.out.printf("Radius: %.3f cm\nArea: %.3f sq-cm\nDiameter: %.3f cm\nCircumference: %.3f cm\n\n", radius, c.getArea(), c.getDiameter(), c.getCircumference());
        //Prints the user's radius, area, diameter, and circumference using the printf() method;

        /***** Calls the footer method *****/

        myFooter(1);
        //Calls the myFooter() method
    }
}
