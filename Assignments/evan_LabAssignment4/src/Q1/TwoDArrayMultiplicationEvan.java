/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 27, 2023
 Description: This is question 1 of Lab Assignment 4 and the task of this question is to perform matrix multiplication through the use of 2D arrays.
 ******************************/

package Q1;
//Declares a package titled "Q1"

import LA3Q.*;
//Imports the methods used in package "LA3Q"

import java.util.Scanner;
//Imports the pre-existing "Scanner" class into the program from the java.util package

public class TwoDArrayMultiplicationEvan {
    //Declares a class named "TwoDArrayMultiplicationEvan" which Java will need to use in order to run the program

    /***** POPULATE ARRAYS METHOD *****/

    public static void populate2DArrays(int[][] ma) {
        //Declares a public static void method titled "populate2DArrays" with an argument declaring "ma" as an int-type 2D array reference variable
        //This method will generate an arbitrary m * n matrix with element values between 2 and 5 inclusive

        for(int row = 0; row < ma.length; row++) {
            //Declares a "for" loop for the variable "row" which is equal to 0, the condition that "row" is less than the length of the 2D array "ma", and that "row" is increasing by 1 using the post-increment "row++"
            //In this "for" loop, "ma.length" represents the number of rows the matrix possesses

            for(int col = 0; col < ma[row].length; col++) {
                //Declares a "for" loop for the variable "col" which is equal to 0, the condition that "col" is less than the length of the row "row", and that "col" is increasing by 1 using the post-increment "col++"
                //In this "for" loop, "ma[row].length" represents the number of columns row "row" possesses

                ma[row][col] = (int) (Math.random()*4+2);
                //Assigns the 2D array "ma" in position "[row][col]" a random value from 2 to 5 inclusive using the "Math.random()" method

            }

        }

    }

    /***** DISPLAY ARRAYS METHOD *****/

    public static void display2DArrays(int[][] ma) {
        //Declares a public static void method titled "display2DArrays" with an argument declaring "ma" as an int-type 2D array reference variable
        //This method will print the user's randomly generated matrix and resultant (multiplied) matrix

        for(int row = 0; row < ma.length; row++) {
            //Declares a "for" loop for the variable "row" which is equal to 0, the condition that "row" is less than the length of the 2D array "ma", and that "row" is increasing by 1 using the post-increment "row++"
            //In this "for" loop, "ma.length" represents the number of rows the matrix possesses

            for(int col = 0; col < ma[row].length; col++) {
                //Declares a "for" loop for the variable "col" which is equal to 0, the condition that "col" is less than the length of the row "row", and that "col" is increasing by 1 using the post-increment "col++"
                //In this "for" loop, "ma[row].length" represents the number of columns row "row" possesses

                System.out.printf("%3d", ma[row][col]);
                //Using the "printf()" method, the program displays one element of the matrix at a time with a spacing of 3 as indicated by "%3d"

            }

            System.out.println();
            //After the int-type variable "col" is no longer less than the number of columns in row "row", the program prints a new line, displaying the next row below the previous row
                //In other words, after the program has finished printing all the elements of one row, it displays the subsequent row underneath

        }

    }

    /***** MULTIPLY ARRAYS METHOD *****/

    public static int[][] multiplyArrays(int[][] a, int[][] b) {
        //Declares a public static int-type 2D array reference variable titled "multiplyArrays" with two arguments declaring "a" and "b" as 2D array reference variables
        //This method will multiply two 2D arrays together of "a" and "b"

        int[][] result = new int[a.length][b[0].length];
        //Declares a 2D int-type array reference variable titled "result" with its row as "a.length" and its column as "b[0].length"

        for(int i = 0; i < result.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the 2D array "result", and that "i" is increasing by 1 using the post-increment "i++"
            //In this "for" loop, "result.length" represents the number of rows the matrix possesses

            for(int j = 0; j < result[i].length; j++) {
                //Declares a "for" loop for the variable "j" which is equal to 0, the condition that "j" is less than the length of the row "i", and that "j" is increasing by 1 using the post-increment "j++"
                //In this "for" loop, "result[i].length" represents the number of columns row "i" possesses

                for(int k = 0; k < b.length; k++) {
                    //Declares a "for" loop for the variable "k" which is equal to 0, the condition that "k" is less than the length of the 2D array "b", and that "k" is increasing by 1 using the post-increment "k++"

                    result[i][j] += a[i][k] * b[k][j];
                    //Multiplying 2D arrays is based on the above algebraic expression
                    //Same as "result[i][j] = result[i][j] + a[i][k] * b[k][j]"

                }

            }

        }

        return result;
        //Returns the 2D array reference variable "result"

    }

    /***** DRIVER METHOD *****/

    public static void main(String[] args) {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method

        /***** HEADER METHOD *****/

        MyMethod.myHeader(4, 1, "The task of this question is to perform matrix multiplication through the use of 2D arrays.");
        //Calls the method "myHeader()" method from the "MyMethod" class and defines the parameters "labNum", "questionNum", and "description" with the appropriate values

        /***** PROMPTS USER TO ENTER ROW AND COLUMN SIZE *****/

        /***** ARRAY 1 *****/

        Scanner input = new Scanner(System.in);
        //Instantiates a Scanner-type reference variable titled "input"

        System.out.println("Multiplying two 2D arrays:");
        //Prints the above text as a literal
        System.out.println("Enter array1 info:");
        //Prints the above text as a literal

        System.out.print("  Enter row-size: ");
        //Prints the above text as a literal
        int row1 = input.nextInt();
        //Assigns the value the user inputted as an int-type variable titled "row1"

        System.out.print("  Enter column-size: ");
        //Prints the above text as a literal
        int col1 = input.nextInt();
        //Assigns the value the user inputted as an int-type variable titled "col1"

        /***** ARRAY 2 *****/

        System.out.println("Enter array2 info:");
        //Prints the above text as a literal
        System.out.print("  Enter row-size: ");
        //Prints the above text as a literal

        int row2 = input.nextInt();
        //Assigns the value the user inputted as an int-type variable titled "row2"

        if (row2 != col1) {
            //Declares an "if" statement stating that if the value of "row2" does not equal the value of "col1", then the program will print an error message and prompt the user to re-enter a value for the row of the second matrix

            do {

                System.out.println("  Row size of the 2nd matrix has to be equal to the column size of first matrix!");
                //Prints the above text as a literal

                System.out.print("  Enter again: ");
                //Prints the above text as a literal
                row2 = input.nextInt();
                //Assigns the value the user inputted as an int-type variable titled "row2"

            } while (row2 != col1);
            //Declares a do-while loop that will continuously run if the condition "(row2 != col1)" is true
            //This loop will run at least once

        }

        System.out.print("  Enter column-size: ");
        //Prints the above text as a literal
        int col2 = input.nextInt();
        //Assigns the value the user inputted as an int-type variable titled "col2"

        /***** DISPLAYS ARRAY 1 *****/

        System.out.printf("\nElements of Array 1, Size[%d x %d]:\n", row1, col1);
        //Using the "printf()" method, the program displays the above text and dimension of the user's first matrix

        int[][] my2DArray1 = new int[row1][col1];
        //Declares a 2D int-type array reference variable titled "my2DArray1" with its row as "row1" and column as "col1"

        populate2DArrays(my2DArray1);
        //Calls the "populate2DArrays()" method with "my2DArray1" as its argument
        //Generates an arbitrary matrix with the row and column parameters given by the user
        display2DArrays(my2DArray1);
        //Calls the "display2DArrays()" method with "my2DArray1" as its argument
        //Displays the user's first matrix

        /***** DISPLAYS ARRAY 2 *****/

        System.out.printf("\nElements of Array 2, Size[%d x %d]:\n", row2, col2);
        //Using the "printf()" method, the program displays the above text and dimension of the user's second matrix

        int[][] my2DArray2 = new int[row2][col2];
        //Declares a 2D int-type array reference variable titled "my2DArray2" with its row as "row2" and column as "col2"

        populate2DArrays(my2DArray2);
        //Calls the "populate2DArrays()" method with "my2DArray2" as its argument
        //Generates an arbitrary matrix with the row and column parameters given by the user
        display2DArrays(my2DArray2);
        //Calls the "display2DArrays()" method with "my2DArray2" as its argument
        //Displays the user's second matrix

        /***** DISPLAYS RESULTANT (MULTIPLIED) MATRIX *****/

        System.out.println("\nMultiplying two arrays [Array 1 x Array 2]..");
        //Prints the above text as a literal
        System.out.printf("The resultant size is: [%d x %d].\n", row1, col2);
        //Prints the above text as a literal and displays the dimension of the resultant matrix
        System.out.println("The elements are...");
        //Prints the above text as a literal

        int[][] result = multiplyArrays(my2DArray1, my2DArray2);
        //Calls the "multiplyArrays()" method with arguments "my2DArray1" and "my2DArray2" and assigns this value to the int-type 2D array reference variable "result"

        display2DArrays(result);
        //Calls the "display2DArrays()" method with "result" as its argument
        //Displays the user's second matrix

        /***** FOOTER METHOD *****/

        MyMethod.myFooter(1);
        //Calls the "myFooter()" method from the "MyMethod" class

    }

}