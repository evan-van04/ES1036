/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 19, 2023
 Description: This is question 2 of Lab Exercise 3 and the task of this question is to print 4 and 8 bit numbers containing only 0's and 1's, double, reverse, and shift arrays, and display each array's corresponding decimal value.
 ******************************/

package Q2;
//Declares a package titled Q2, which groups the classes "BinaryToDecimalEvan" and "DemoBinaryToDecimal" into one folder

import LA3Q.*;
//Imports the methods used in package "LA3Q"

public class DemoBinaryToDecimal {
    //Creating a class named "DemoBinaryToDecimal" which Java will need to use in order to run the program

    /***** DRIVER METHOD *****/

    public static void main(String[] args) {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method

        /***** HEADER METHOD *****/

        MyMethod.myHeader(3, 2, "The task of this question is to print 4 and 8 bit numbers containing only 0's and 1's, double, reverse, and shift arrays, and display each array's corresponding decimal value.");
        //Calls the method "myHeader()" method from the "MyMethod" class and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        /***** RANDOMLY GENERATED 4 BIT NUMBER *****/

        int[] binaryArray = new int[4];
        //Assigns the array "binaryArray" with a length of 4 from 0 to 3

        for (int i = 0; i < binaryArray.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "binaryArray", and that "i" is increasing by 1 using the post-increment "i++"
            binaryArray[i] = (int) Math.round(Math.random());
            //Assigns a random value of either 0 or 1 to "binaryArray[i]" using the Math.round() and Math.random() methods
        }

        /***** PRINTS THE 4 BIT NUMBER AND ITS CORRESPONDING DECIMAL VALUE *****/

        BinaryToDecimalEvan myBinaryArray = new BinaryToDecimalEvan(binaryArray);
        //Declares a "BinaryToDecimalEvan" type reference variable titled "myBinaryArray" and instantiates it with the array reference variable "binaryArray"

        System.out.print("\nThe 4 bit number: ");
        //Prints the text above as a literal

        myBinaryArray.displayArray();
        //Calls the "displayArray()" method from the "BinaryToDecimalEvan" class

        System.out.println("The corresponding decimal value is: " + myBinaryArray.getDecimalValue());
        //Prints the above text as a literal with the corresponding decimal value by calling the "getDecimalValue()" method from the "BinaryToDecimalEvan" class

        /***** PRINTS THE DOUBLED 4 BIT NUMBER (8) AND ITS CORRESPONDING DECIMAL VALUE *****/

        myBinaryArray.doubleTheSizeZeroPadding();
        //Calls the "doubleTheSizeZeroPadding()" method from the "BinaryToDecimalEvan" class

        System.out.print("The 8 bit number, after the size is doubled and zero padded: ");
        //Prints the text above as a literal

        myBinaryArray.displayArray();
        //Calls the "displayArray()" method from the "BinaryToDecimalEvan" class

        System.out.println("The corresponding decimal value is: " + myBinaryArray.getDecimalValue());
        //Prints the above text as a literal with the corresponding decimal value by calling the "getDecimalValue()" method from the "BinaryToDecimalEvan" class

        /***** PRINTS THE 8 BIT NUMBER IN REVERSE AND ITS CORRESPONDING DECIMAL VALUE *****/

        myBinaryArray.reverseArray();
        //Calls the "reverseArray()" method from the "BinaryToDecimalEvan" class

        System.out.print("The 8 bit number after reversing the array: ");
        //Prints the text above as a literal

        myBinaryArray.displayArray();
        //Calls the "displayArray()" method from the "BinaryToDecimalEvan" class

        System.out.println("The corresponding decimal value is: " + myBinaryArray.getDecimalValue());
        //Prints the above text as a literal with the corresponding decimal value by calling the "getDecimalValue()" method from the "BinaryToDecimalEvan" class

        /***** PRINTS THE SHIFTED 8 BIT NUMBER AND ITS CORRESPONDING DECIMAL VALUE *****/

        myBinaryArray.shiftRight();
        //Calls the "shiftRight()" method from the "BinaryToDecimalEvan" class

        System.out.print("The 8 bit number after the shift right operation: ");
        //Prints the text above as a literal

        myBinaryArray.displayArray();
        //Calls the "displayArray()" method from the "BinaryToDecimalEvan" class

        System.out.println("The corresponding decimal value is: " + myBinaryArray.getDecimalValue());
        //Prints the above text as a literal with the corresponding decimal value by calling the "getDecimalValue()" method from the "BinaryToDecimalEvan" class

        /***** PRINTS THE SHUFFLED 8 BIT NUMBER AND ITS CORRESPONDING DECIMAL VALUE *****/

        myBinaryArray.shuffleArray();
        //Calls the "shuffleArray()" method from the "BinaryToDecimalEvan" class

        System.out.print("The 8 bit number after the shuffling operation: ");
        //Prints the text above as a literal

        myBinaryArray.displayArray();
        //Calls the "displayArray()" method from the "BinaryToDecimalEvan" class

        System.out.println("The corresponding decimal value is: " + myBinaryArray.getDecimalValue());
        //Prints the above text as a literal with the corresponding decimal value by calling the "getDecimalValue()" method from the "BinaryToDecimalEvan" class

        /***** FOOTER METHOD *****/

        MyMethod.myFooter(2);
        //Calls the "myFooter()" method from the "MyMethod" class
    }
}
