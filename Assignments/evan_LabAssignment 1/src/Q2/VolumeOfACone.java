/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: January 29, 2023
 Description: This is question 2 of Lab Assignment 1 and the task of this question is to ask the user to input the height and radius of a cone and output the volume of the cone to the console.
 ******************************/

package Q2;

import java.util.Scanner; //Imports a pre-existing Scanner class into the program from the java.util package
public class VolumeOfACone { //Creating a class named "VolumeOfACone" which Java will need to use in order to run the program
        public static void main(String[] args) { //main() is used as an entry point in Java and all Java programs require a main method

                /***** Beginning text that the user will see on their standard output (computer monitor) *****/

                System.out.println("******************************************************");
                System.out.println("Full Name: Evan Van"); //Prints my name
                System.out.println("Student Number: 251287806"); //Prints my student number
                System.out.println("Date: January 29, 2023"); //Prints the date
                System.out.println("Brief description of the task: The task of this question is to ask the user to input the height and radius of a cone and output the volume of the cone to the console."); //Prints a brief description of the task being accomplished in this question
                System.out.println("******************************************************");

                /***** Prompts the user to enter their values for the height and radius of the cone *****/

                Scanner input = new Scanner(System.in); //Prepares a Scanner type reference variable/object to input a value from the standard input (keyboard)
                System.out.println();
                System.out.println("Please enter a height of the cone: "); //Prompts the user to enter a value for the height of the cone
                double height = input.nextDouble(); //Assigns the value the user inputted as variable "height"
                System.out.println("Please enter a radius of the cone: "); //Prompts the user to enter a value for the radius of the cone
                double radius = input.nextDouble(); //Assigns the value the user inputted as variable "radius"
                System.out.println();

                /***** Calculates the volume of the cone *****/

                double volume = (Math.PI*Math.pow(radius,2)*height)/3; //Calculates the volume of the cone
                System.out.printf("The volume of a cone with radius %.2f cm and height %.2f cm is: %.2f cubic cm" , radius, height, volume); //Prints the volume of the cone from the height and radius values that the user provided using the "printf" method, rounding all values to 2 decimal places
                System.out.println();
                System.out.println("******************************************************");
        }
}
