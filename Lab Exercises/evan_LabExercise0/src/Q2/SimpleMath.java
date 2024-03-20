/******************************
 Evan Van
 251287806
 January 22, 2023
 Description: This is question 2 of Lab Exercise 0 and the task of this question is to generate simple arithmetic operations including addition, subtraction, multiplication, and division
 ******************************/

package Q2;

import java.util.Scanner; //Imports a pre-existing Scanner class into the program from the java.util package
public class SimpleMath { //Creating a class named "SimpleMath" which Java will need to use in order to run the program
    public static void main(String[] args) { //main() is used as an entry point in Java and all Java programs require a main method

        /***** Beginning text the user will see on their standard output (computer monitor) *****/

        System.out.println("Hello again! This is Evan Van."); //Prints a message to the user "Hello again! This is Evan Van."
        System.out.println("Student Number: 251287806"); //Prints a message to the user "Student Number: 251287806"
        System.out.println("Date: January 22, 2023"); //Prints a message to the user "Date: January 22, 2023"
        System.out.println("-----------------------"); //Prints a border separating the text
        System.out.println("Let's do some simple mathematical calculations."); //Prints a message to the user "Let's do some simple mathematical calculations."
        System.out.println("Converting a temperature from Celsius scale to Fahrenheit scale..."); //Prints a message to the user "Converting a temperature from Celsius scale to Fahrenheit scale..."

        /***** Code that allows the user to input their value through their standard input (keyboard) *****/

        Scanner input = new Scanner(System.in); //Prepares a Scanner type reference variable/object to input a value from the standard input (keyboard)
        System.out.println("Enter a temperature in Celsius: "); //Prompts the user to enter a value in Celsius into their standard input (keyboard)
        double c = input.nextDouble(); //Assigns the value the user inputted as variable "c"
        double f = (c * 9/5) + 32; //Calculates the value inputted by the user and uses the given formula to convert the value into Fahrenheit, as illustrated by the variable "f"
        System.out.println(c + " degree Celsius is " + Math.round(f*10.0)/10.0 + " degree Fahrenheit!"); //Prints the user's initial value in Celsius followed by the value in Fahrenheit, which has been rounded to the nearest tenths place
        System.out.println("Question 2 is successfully done!"); //Prints the message "Question 2 is successfully done!" bringing this program to an end
    }
}
