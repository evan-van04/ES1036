/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 6, 2023
 Description: This is question 1 of Lab Assignment 3 and the task of this question is to prompt the user to select a mathematical function and display an example with that function using conditional and loop statements.
 ******************************/

package LabQ3;
//Declares a package titled LabQ3, which groups the classes "MyMethod" and "DemoMyMethodsEvan" into one folder

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package

public class DemoMyMethodsEvan {
    //Creating a class named "DemoMyMethodsEvan" which Java will need to use in order to run the program

    public static final Scanner input = new Scanner(System.in);
    //Declares a Scanner type field called "input"

    /***** Driver method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method

        MyMethod.myHeader(3, 1, "The task of this question is to prompt the user to select a mathematical function and display an example with that function using conditional and loop statements.");
        //Calls the method "myHeader" and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        System.out.println("Testing Mathematical Functions:");

        /***** Menu *****/

        char choice;
        //Declares a character type variable titled "choice"
        while (true) {
            System.out.println("\n=======MENU=======");
            //Prints the header of the menu
            System.out.println("a: Power Function");
            //Prints the option of the power function
            System.out.println("b: Factorial Function");
            //Prints the option of the factorial function
            System.out.println("c: Sine Function");
            //Prints the option of the sine function
            System.out.println("d: Cosine Function");
            //Prints the option of the cosine function
            System.out.println("e: exit");
            //Prints the option to exit the program
            System.out.println("==================\n");

            System.out.print("Enter your choice: ");
            //Prompts the user to enter their choice
            choice = input.next().charAt(0);
            //Assigns the character the user inputted as variable "choice"
            choice = MyMethod.myToLowerCase(choice);
            //Calls the method myToLowerCase() from the "MyMethod" class to convert the user's inputted character from uppercase to lowercase

            switch (choice) {
                //Declares a switch statement for the variable "choice"

                /***** Option 1 (Power Function) *****/

                case 'a':
                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y.");
                    //Prints the message "POWER FUNCTION: Calculating x to the power of y." as a literal
                    System.out.println("Enter x: ");
                    //Prompts the user to enter an "x" value
                    double x = input.nextDouble();
                    //Assigns the user's inputted value to the variable "x"
                    System.out.println("Enter y: ");
                    //Prompts the user to enter a "y" value
                    int y = input.nextInt();
                    //Assigns the user's inputted value to the variable "y"
                    double resultPow = MyMethod.myPow(x, y);
                    //Calls the myPow() method from the "MyMethod" Java class
                    System.out.printf("%.2f^%d = %.2f\n", x, y, resultPow);
                    //Prints the result of "x^y" using the printf() method
                    break;
                    //The break statement terminates the remainder of the switch statement

                /***** Option 2 (Factorial Function) *****/

                case 'b':
                    System.out.println("\nFACTORIAL FUNCTION: Calculating factorial(n).");
                    //Prints the message "FACTORIAL FUNCTION: Calculating factorial(n)." as a literal
                    System.out.print("Enter n: ");
                    //Prompts the user to enter an "n" value
                    int n = input.nextInt();
                    //Assigns the user's inputted value to the variable "n"

                    if (n < 0) {
                        do {
                            System.out.print("n has to be >= 0; enter again: ");
                            n = input.nextInt();
                        } while (n < 0);
                        //Declares a "do-while" within an "if" loop that states if n is less than 0, the following message "n has to be >= 0; enter again: " will be printed until "n" is no longer less than 0
                        double resultFac = MyMethod.myFactorial(n);
                        //Calls the myFactorial() method from the "MyMethod" Java class
                        System.out.printf("%d! = %.2e\n", n, resultFac);
                        //Prints the factorial of the user's inputted value using the printf() method
                    }

                    break;
                    //The break statement terminates the remainder of the switch statement

                /***** Option 3 (Sine Function) *****/

                case 'c':
                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree.");
                    //Prints the message "SINE FUNCTION: Calculating sin(k) degree." as a literal
                    System.out.print("Enter k in degrees: ");
                    //Prompts the user to enter a value "k" in degrees
                    double k = input.nextDouble();
                    //Assigns the user's inputted value to the variable "k"
                    double radianSin = MyMethod.myDegreeToRadian(k);
                    //Calls the myDegreeToRadian() method to convert the user's value from degrees to radians
                    double resultSin = MyMethod.mySin(radianSin);
                    //Calls the mySin() method to retrieve the sine of the user's radian value
                    System.out.printf("sin(%.2f) degree = %.2f\n", k, resultSin);
                    //Prints the sine of the user's inputted radian value using the printf() method
                    break;
                    //The break statement terminates the remainder of the switch statement

                /***** Option 4 (Cosine Function) *****/

                case 'd':
                    System.out.println("\nCOSINE FUNCTION: Calculating cos(m) degree.");
                    //Prints the message "COSINE FUNCTION: Calculating cos(m) degree." as a literal
                    System.out.print("Enter m in degrees: ");
                    //Prompts the user to enter a value "m" in degrees
                    double m = input.nextDouble();
                    //Assigns the user's inputted value to the variable "m"
                    double radianCos = MyMethod.myDegreeToRadian(m);
                    //Calls the myDegreeToRadian() method to convert the user's value in degrees to radians
                    double resultCos = MyMethod.myCos(radianCos);
                    //Calls the myCos() method to retrieve the cosine of the user's radian value
                    System.out.printf("cos(%.2f) degree = %.2f\n", m, resultCos);
                    //Prints the cosine of the user's inputted radian value using the printf() method
                    break;
                    //The break statement terminates the remainder of the switch statement

                /***** Option 5 (Exit) *****/

                case 'e':

                    /***** Calls the footer method *****/

                    MyMethod.myFooter(1);
                    //Calls the myFooter() method
                    break;
                    //The break statement terminates the remainder of the switch statement

                /***** Invalid Choice *****/

                default:
                    System.out.println("Invalid Choice!");
                    //If none of the above options are true (if the user inputs a value other than a, b, c, d, or e), then the program will print the message "Invalid Choice!" as a literal
                    break;
                    //The break statement terminates the remainder of the switch statement

            }
                if (choice == 'e') {
                    //If choice "e" is chosen by the user, the program will terminate
                    break;
                    //The break statement terminates the remainder of the switch statement
            }
        }
    }
}