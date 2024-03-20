/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 27, 2023
 Description: This is question 2 of Lab Exercise 2 and the task of this question is to display the mathematical concept of imaginary numbers and their sum, product, magnitude, and angle through the use of conditional "if" and "else" statements.
 ******************************/

package Q2;
//Declares a package titled Q2, which groups the classes "ComplexNumber" and "ComplexNumberDemoEvan" into one folder

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package
import Q1.StudentGradesByEvan;
//Imports the header and footer methods from package Q1, java class "StudentGradesByEvan"

public class ComplexNumberDemoEvan {
    //Creating a class named "ComplexNumberDemoEvan" which Java will need to use in order to run the program

    public static Scanner input = new Scanner(System.in);
    //Declares a Scanner type field called "input"

    public static int counter = 0;
    //Declares a field called "counter" and assigning the value to zero
    //This field will keep count of the number of complex numbers inside the dataEntry() method

    /***** User Input *****/

    public static ComplexNumber dataEntry() {
        //Declares a method called dataEntry()
        counter++;
        //Increments the integer type field, "counter," by +1
        System.out.println("\nComplex number " +counter+ " data......");
        //Prints the number of the current complex number using the "counter" field
        System.out.print("Enter the real term: ");
        //Prompts the user to enter the real term
        double real = input.nextDouble();
        //Assigns the value the user inputted as variable "real"
        System.out.print("Enter the imaginary term: ");
        //Prompts the user to enter the imaginary term
        double imaginary = input.nextDouble();
        //Assigns the value the user inputted as variable "imaginary"
        return new ComplexNumber(real, imaginary);
        //Returns the values the user inputted for the real and imaginary terms
    }

    /***** Mathematical Operations *****/

    public static ComplexNumber complexAdder(ComplexNumber x, ComplexNumber y) {
        //Declares a "ComplexNumber" type reference variable called "complexAdder" with arguments "ComplexNumber x" and "ComplexNumber y"
        double real = x.getReal() + y.getReal();
        //Adds the real terms of both complex numbers and assigns that value to the variable "real"
        double imaginary = x.getImaginary() + y.getImaginary();
        //Adds the imaginary terms of both complex numbers and assigns that value to the variable "imaginary"
        return new ComplexNumber(real, imaginary);
        //Returns the sum of the real and imaginary terms of the two complex numbers
    }

    public static ComplexNumber complexMultiplier(ComplexNumber x, ComplexNumber y) {
        //Declares a "ComplexNumber" type reference variable called "complexMultiplier" with arguments "ComplexNumber x" and "ComplexNumber y"
        double real = (x.getReal() * y.getReal()) - (x.getImaginary() * y.getImaginary());
        //Multiplies the real terms of both complex numbers and assigns that value to the variable "real"
        double imaginary = (x.getReal() * y.getImaginary()) + (x.getImaginary() * y.getReal());
        //Multiplies the imaginary terms of both complex numbers and assigns that value to the variable "imaginary"
        return new ComplexNumber(real, imaginary);
        //Returns the product of the real and imaginary terms of the two complex numbers
    }

    /***** Driver Method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method

        Q1.StudentGradesByEvan.myHeader(2, 2, "The task of this question is to display the mathematical concept of imaginary numbers and their sum, product, magnitude, and angle through the use of conditional 'if' and 'else' statements.");
        //Calls the method "myHeader" and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        ComplexNumber x = dataEntry();
        //Declares a "ComplexNumber" type reference for variable "x" and assigns the method dataEntry() to it
        ComplexNumber y = dataEntry();
        //Declares a "ComplexNumber" type reference for variable "y" and assigns the method dataEntry() to it

        System.out.println("\nYou have entered the following two complex numbers x and y:");
        //Displays the message "You have entered the following two complex numbers x and y:" to the user
        System.out.print("x = ");
        //Displays the message "x = " to the user
        x.displayRecForm();
        //Displays the first complex number using the method displayRecForm()
        System.out.print("\ny = ");
        //Displays the message "x = " to the user
        y.displayRecForm();
        //Displays the second complex number using the method displayRecForm()

        ComplexNumber addRes = complexAdder(x, y);
        //Calls the complexAdder() method with arguments "x" and "y" and assigns it to the reference variable "addRes"
        ComplexNumber mulRes = complexMultiplier(x, y);
        //Calls the complexMultiplier() method with arguments "x" and "y" and assigns it to the reference variable "mulRes"

        System.out.println("\n\nHere are the results of the arithmetic operations:");
        //Displays the message "Here are the results of the arithmetic operations:" to the user
        System.out.print("x + y = ");
        //Displays the message "x + y = " to the user
        addRes.displayRecForm();
        //Displays the summation of the first complex number by calling the displayRecForm() method
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", addRes.getMagnitude(), addRes.getAngle());
        //Prints the first complex number's magnitude and angle by calling the displayRecForm() method
        System.out.print("\nx * y = ");
        //Displays the message "x * y = " to the user
        mulRes.displayRecForm();
        //Displays the product of the second complex number by calling the displayRecForm() method
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees\n", mulRes.getMagnitude(), mulRes.getAngle());
        //Prints the second complex number's magnitude and angle by calling the displayRecForm() method

        /***** Calls the Footer Method *****/

        Q1.StudentGradesByEvan.myFooter(2);
        //Calls the myFooter() method from package Q1, java class "StudentGradesByEvan"
    }
}