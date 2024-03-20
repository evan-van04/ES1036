/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 6, 2023
 Description: This is question 1 of Lab Exercise 1 and the task of this question is to allow the user to enter their height in cm, to which it gets converted to inches and then feet.
 ******************************/

package Q1;

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package

public class MethodDemo {
    //Creating a class named "MethodDemo" which Java will need to use in order to run the program

    /***** Defines the method myHeader() and prints an introductory message *****/

    public static void myHeader(int labNum, int questionNum, String description) {
        //Defines a method called "myHeader" containing 3 variables of "labNum", "questionNum", and "description"
        System.out.println("****************************************************");
        System.out.println("Full Name: Evan Van");
        //Prints my name in literal
        System.out.println("Lab Exercise: " + labNum + ", Question: " + questionNum);
        //Prints the lab exercise and question number using variables "labNum" and "questionNum"
        System.out.println("Program Description: " + description);
        //Prints the description of the program using the variable "description"
        System.out.println("*****************************************************");
    }

    /***** Defines the method myFooter() *****/

    public static void myFooter(int questionNum) {
        //Defines a method called myFooter, containing the variable "questionNum"
        System.out.println("*** Signing off from Question " + questionNum + " – Evan ***");
        //Prints a concluding sentence with the variable "questionNum"
    }

    /***** Defines the method cmToInchConverter(), which returns the user's value from cm to inches *****/

    public static double cmToInchConverter(double cm) {
        //Defines a method called cmToInchConverter as a double
        return cm / 2.54;
        //Returns the value in cm to inches
    }

    /***** Driver method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method
        myHeader(1, 1, "The task of this question is to allow the user to enter their height in cm, to which it gets converted to inches and then feet.");
        //Defines the method "myHeader"

        /***** Prompts the user to enter a height in cm and returns the value in inches *****/

        System.out.println();
        //Prints an empty line on the user's standard output
        Scanner input = new Scanner(System.in);
        //Prepares a Scanner type reference variable/object to input a value from the standard input
        System.out.print("Enter your height in cm: ");
        //Prints dialog to the user prompting them to enter their height in cm
        double heightInCm = input.nextDouble();
        //Assigns the value the user inputted as variable "heightInCm"
        double heightInInches = cmToInchConverter(heightInCm);
        //Calls the "cmToInchConverter()" method from above and tells the program to convert the user's inputted value from cm to inches and assigns this value to the variable called "heightInInches"
        System.out.printf("%.2f cm = %.2f inches\n", heightInCm, heightInInches);
        //Using the printf() method, the program prints the users inputted value in cm and inches to 2 decimal places

        /***** Converts and displays the user's height from cm to feet and inches *****/

        int feet = (int) (heightInInches / 12);
        //Converts the user's height in inches to feet and assigns it to the variable name "feet"
        double leftoverInches = heightInInches % 12;
        //Calculates the user's left over inches by performing "heightInInches" % 12
        System.out.printf("%.2f inches = %d ft %.2f inch\n", heightInInches, feet, leftoverInches);
        //Displays the user's height in inches and in feet with the leftover inches using the printf() method

        /***** Calls the method myFooter() *****/

        System.out.println();
        //Prints an empty line on the user's standard output
        myFooter(1);
        //Calls the myFooter() method
    }
}
