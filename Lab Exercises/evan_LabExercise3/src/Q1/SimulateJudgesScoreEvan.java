/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 19, 2023
 Description: This is question 1 of Lab Exercise 3 and the task of this question is to print 5 random scores from 7 to <10 and the highest, lowest, final, and average score using arrays.
 ******************************/

package Q1;
//Declares a package titled Q1

import LA3Q.*;
//Imports the methods used in package "LA3Q"

public class SimulateJudgesScoreEvan {
    //Creates a class named "SimulateJudgesScoreEvan" which Java will need to use in order to run the program

    /***** RANDOM SCORE GENERATOR METHOD *****/

    public static void populateArray(double[] anyName) {
        //Declares a public static method titled "populateArray()" with an argument declaring "anyName" as a double-type array reference variable

        for(int i = 0; i < anyName.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "anyName", and that "i" is increasing by 1 using the post-increment "i++"
            anyName[i] = Math.random() * 3 + 7;
            //Generates a random number with the range: 7<=number<10 using the Math.random() method
            //The array "anyName" gets populated by these random numbers
        }
    }

    /***** SCORE DISPLAY METHOD *****/

    public static void displayArray(double[] anyName) {
        //Declares a public static method titled "displayArray()" with an argument declaring "anyName" as a double-type array reference variable

        System.out.println("Here are the scores from 5 judges:");
        //Prints the above text as a literal
        System.out.print("[");
        //Prints the above text as a literal

        for(int i = 0; i < anyName.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "anyName", and that "i" is increasing by 1 using the post-increment "i++"
            System.out.printf( "%.2f, ", anyName[i]);
            //Using the printf() method, the program prints all 5 randomly generated scores in the "anyName" array to 2 decimal places
        }

        System.out.print("\b\b]");
        //Uses 2 backspace escape characters to delete the space and comma after the last displayed score
    }

    /***** DISCARDING HIGHEST AND LOWEST SCORES METHOD *****/

    public static double finalScore(double[] anyName) {
        //Declares a public static double method titled "finalScore()" with an argument declaring "anyName" as a double-type array reference variable

        double[] newArray = new double[5];
        //Declares a double-type array reference variable titled "newArray" which has a size of 5 from 0 to 4

        System.arraycopy(anyName, 0, newArray, 0, anyName.length);
        //Copies the contents of the array "anyName" from its starting position to the starting position of the newly created array "newArray"

        double max = anyName[0];
        //Assigns the first spot of the array "anyName" to the double-type variable "max"

        double min = anyName[0];
        //Assigns the first spot of the array "anyName" to the double-type variable "min"

        for (int i = 1; i < anyName.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 1, the condition that "i" is less than the length of the array "anyName", and that "i" is increasing by 1 using the post-increment "i++"
            if (anyName[i] < min) {
                min = anyName[i];
                //Declares an "if" statement with the condition that if "anyName[i]" is less than "min", "min" will be assigned the value of "anyName[i]"
            }

            if (anyName[i] > max) {
                max = anyName[i];
                //Declares an "if" statement with the condition that if "anyName[i]" is greater than "max", "max" will be assigned the value of "anyName[i]"
            }
        }

        System.out.printf("\n   Highest Score: %.2f\n",max);
        //Using the printf() method, the program prints the largest generated score to 2 decimal places
        System.out.printf("   Lowest Score: %.2f\n",min);
        //Using the printf() method, the program prints the smallest generated score to 2 decimal places
        System.out.println("Here are the scores after discarding the highest and the lowest scores:");
        //Prints the above text as a literal

        double sum = 0;
        //Declares a double-type variable titled "sum" which is assigned the value of 0
        //This variable will be used to calculate the sum of the remaining scores (i.e. All scores except the highest and lowest)

        for (int i = 0; i < newArray.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "newArray", and that "i" is increasing by 1 using the post-increment "i++"
            if (newArray[i] == max || newArray[i] == min) {
                newArray[i] = 0;
                //Declares an "if" statement with the condition that if "anyName[i]" is equal to "max" or if "anyName[i]" is equal to "min", "anyName[i]" will be assigned the value of 0
                //In this "if" statement, only one of the conditions have to be true for the statement to run
            }

            sum += newArray[i];
            //Sums each value in the "newArray" together
        }

        double average = sum / 3;
        //Declares a double-type variable titled "average" which is assigned the value of "sum / 3"

        System.out.print("[");
        //Prints the above text as a literal

        for (int i = 0; i < newArray.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "newArray", and that "i" is increasing by 1 using the post-increment "i++"
            System.out.printf("%.2f, ", newArray[i]);
            //Using the printf() method, the program prints the new values of "newArray[i]" (which includes 0.00's in place of the highest and lowest scores) to 2 decimal places
        }

        System.out.print("\b\b");
        //Uses 2 backspace escape characters to delete the space and comma after the last displayed score

        System.out.print("]\n");
        //Prints the above text as a literal and begins a new line using the new line character "\n"
        System.out.printf("   The final score: %.2f\n", average);
        //Using the printf() method, the program prints the average of the 3 remaining randomly generated scores to 2 decimal places

        return max;
        //Returns the variable "max"
    }

    /***** DRIVER METHOD *****/

    public static void main(String[] args) {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method

        MyMethod.myHeader(3, 1, "The task of this question is to print 5 random scores from 7 to <10 and the highest, lowest, final, and average score using arrays.");
        //Calls the method "myHeader" and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        double[] myArray = new double[5];
        //Declares a double-type array reference variable titled "myArray" with a size of 5 from 0 to 4

        populateArray(myArray);
        //Calls the "populateArray" method with the array "myArray"
        displayArray(myArray);
        //Calls the "displayArray" method with the array "myArray"
        finalScore(myArray);
        //Calls the "finalScore" method with the array "myArray"

        MyMethod.myFooter(1);
        //Calls the myFooter() method
    }
}