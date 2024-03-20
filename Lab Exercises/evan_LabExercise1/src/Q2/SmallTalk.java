/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 6, 2023
 Description: This is question 2 of Lab Exercise 1 and the task of this question is to convey a dialog while also prompting the user to input values of their to be converted between Celsius and Fahrenheit.
 ******************************/

package Q2;

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package
import Q1.MethodDemo;
//Imports the methods from Q1 into Q2

public class SmallTalk {
    //Creating a class named "SmallTalk" which Java will need to use in order to run the program

    /***** Defines the method celsiusToFahrenheit() and returns a value from Celsius to Fahrenheit *****/

    public static double celsiusToFahrenheit(double celsius) {
        //Defines a method called celsiusToFahrenheit()
        return celsius / 5 * 9 + 32;
        //Returns a value from Celsius to Fahrenheit
    }

    /***** Defines the method fahrenheitToCelsius() and returns a value from Fahrenheit to Celsius *****/

    public static double fahrenheitToCelsius (double fahrenheit) {
        //Defines a method called fahrenheitToCelsius
        return (fahrenheit - 32) / 9 * 5;
        //Returns a value from Fahrenheit to Celsius
    }

    /***** Driver method *****/
    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method

        /***** Calls the method myHeader() from Q1 Method Demo *****/

        MethodDemo.myHeader(1, 2, "The task of this question is to convey a dialog while also prompting the user to input a value to be converted between Celsius and Fahrenheit.");
        //Calls my public static method myHeader from Q1 MethodDemo

        /***** Outdoor temperature dialog: Celsius to Fahrenheit conversion *****/

        System.out.println();
        //Prints an empty line on the user's standard output
        Scanner input = new Scanner(System.in);
        //Prepares a Scanner type reference variable/object to input a value from the standard input
        System.out.println("What is the outdoor temperature now?");
        //Prints dialog to the user
        double outdoorTempC = input.nextDouble();
        //Assigns the value the user inputted as variable "outdoorTempC"
        double outdoorTempF = celsiusToFahrenheit(outdoorTempC);
        //Calls the "celsiusToFahrenheit()" method from above and tells the program to convert the user's inputted value from Celsius to Fahrenheit and assigns this value to the variable called "outdoorTempF"
        System.out.printf("\tI know you're used to Fahrenheit scale. %.2f deg-C is %.2f deg-F.", outdoorTempC, outdoorTempF);
        //Displays a dialog with the user's inputted value in Celsius and the converted value in Fahrenheit
        System.out.println();
        //Prints an empty line on the user's standard output

        /***** Indoor temperature dialog: Celsius to Fahrenheit conversion *****/

        System.out.println("I am cold! What is the indoor temperature?");
        //Prints dialog to the user
        double indoorTempC = input.nextDouble();
        //Assigns the value the user inputted as variable "indoorTempC"
        double indoorTempF = celsiusToFahrenheit(indoorTempC);
        //Calls the "celsiusToFahrenheit()" method from above and tells the program to convert the user's inputted value from Celsius to Fahrenheit and assigns this value to the variable called "indoorTempF"
        System.out.printf("\t%.2f deg-C is %.2f deg-F.", indoorTempC, indoorTempF);
        //Displays a dialog with the user's inputted value in Celsius and the converted value in Fahrenheit
        System.out.println();
        //Prints an empty line on the user's standard output

        /***** Thermostat dialog: Fahrenheit to Celsius conversion *****/

        System.out.println("I see. Would you crank up the temperature?");
        //Prints dialog to the user
        System.out.println("\tOk I'll! What temperature should I set the thermostat to?");
        //Prints dialog to the user
        double thermostatTempF = input.nextDouble();
        //Assigns the value the user inputted as variable "thermostatTempF"
        double thermostatTempC = fahrenheitToCelsius(thermostatTempF);
        //Calls the "fahrenheitToCelsius()" method from above and tells the program to convert the user's inputted value from Fahrenheit to Celsius and assigns this value to the variable called "thermostatTempC"
        System.out.printf("\tOh, you mean %.2f deg Fahrenheit! Here you go.", thermostatTempF);
        //Prints the user's inputted value embedded within some dialog using the printf() method
        System.out.println();
        //Prints an empty line on the user's standard output
        System.out.printf("\tBy the way, %.2f deg-F is %.2f deg-C.", thermostatTempF, thermostatTempC);
        //Prints the user's inputted value in Fahrenheit and Celsius
        System.out.println();
        //Prints an empty line on the user's standard output
        System.out.println("Thank you! It is very nice of you.");
        //Prints dialog to the user

        /***** Calls the method myFooter() from Q1 Method Demo *****/

        System.out.println();
        //Prints an empty line on the user's standard output
        MethodDemo.myFooter(2);
        //Calls the myFooter() method from Q1 Method Demo
        }
}
