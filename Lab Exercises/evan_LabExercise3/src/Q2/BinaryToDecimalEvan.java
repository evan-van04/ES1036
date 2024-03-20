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

public class BinaryToDecimalEvan {
    //Creating a class named "BinaryToDecimalEvan" which Java will need to use in order to run the program

    private int[] binaryArray;
    //Defines a private integer-type array field titled "binaryArray"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public BinaryToDecimalEvan() {}
        //Declares a constructor titled "BinaryToDecimalEvan()" without any arguments

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public BinaryToDecimalEvan(int[] myArray) {
        //Declares a constructor titled "BinaryToDecimalEvan()" declaring "myArray" as an integer-type array reference variable

        binaryArray = myArray;
        //Assigns the value of "myArray" to "binaryArray"
    }

    /***** BIT NUMBER DISPLAY METHOD *****/

    public void displayArray() {
        //Defines a public void method titled "displayArray()" which will display the bit numbers

        System.out.print("[");
        //Prints the above text as a literal

        for (int i = 0; i < binaryArray.length; i++) {
            //Declares a "for" loop for the variable "i" which equals 0, the condition that "i" is less than the length of the array "binaryArray", and that "i" is increasing by 1 using the post-increment "i++"
            System.out.print(binaryArray[i] + " ");
            //Prints the value of "binaryArray[i]" from 0 to the length of "binaryArray"
        }

        System.out.println("\b]");
        //Prints the above text as a literal
    }

    /***** BIT NUMBER TO DECIMAL VALUE CONVERTER METHOD *****/

    public int getDecimalValue() {
        //Defines a public int method titled "getDecimalValue()" which converts a bit number into a decimal value

        int decimal = 0;
        //Declares "decimal" as an integer-type variable, assigning the value of 0 to it

        int power = 0;
        //Declares "power" as an integer-type variable, assigning the value of 0 to it

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            //Declares a "for" loop for the variable "i" which equals one value less than the length of "binaryArray", the condition that "i" is greater than or equal to 0, and that "i" is decreasing by 1 using the post-decrement "i--"
            decimal += binaryArray[i] * MyMethod.myPow(2, power);
            //Calculates the conversion between a bit number to decimal value
                //Example [1 0 1 0] (bit number): 0 x 2^0 + 1 x 2^1 + 0 x 2^2 + 1 x 2^3 = 10 (decimal value)
            power++;
            //Post-increments the variable "power"
        }

        return decimal;
        //Returns the value of "decimal"
    }

    /***** SIZE DOUBLER METHOD *****/

    public void doubleTheSizeZeroPadding() {
        //Defines a public void method titled "doubleTheSizeZeroPadding()" which will add 4 zeros to the left of the 4 bit number, making it an 8 bit number

        int[] doubledArray = new int[binaryArray.length * 2];
        //Declares "doubleArray" as an integer-type array reference variable with a length double that of the array "binaryArray"

        System.arraycopy(binaryArray, 0, doubledArray, binaryArray.length, binaryArray.length);
        //Using the "arraycopy" method, the array "binaryArray" is being copied to another array titled "doubledArray"
        //"binaryArray" is being copied from the 1st (0) position of the array and being pasted onto the 4th (3) position of "doubledArray"

        binaryArray = doubledArray;
        //The values of "doubledArray" is being assigned to "binaryArray"
    }

    /***** ARRAY REVERSAL METHOD *****/

    public int[] reverseArray() {
        //Defines a public int[] method titled "reverseArray()" which will reverse the order of the array

        int[] reversedArray = new int[binaryArray.length];
        //Declares an integer-type array reference variable with the same length of the array "binaryArray"

        System.arraycopy(binaryArray, 0, reversedArray, 0, binaryArray.length);
        //Using the "arraycopy" method, the array "binaryArray" is being copied to another array titled "reversedArray"
        //"binaryArray" is being copied from the 1st (0) position of the array and being pasted onto the 1st (0) position of "reversedArray"

        for (int i = reversedArray.length - 1; i >= 0; i--) {
            //Declares a "for" loop for the variable "i" which equals one value less than the length of array "reversedArray", the condition that "i" is greater than or equal to 0, and that "i" is decreasing by 1 using the post-decrement "i--"
            binaryArray[i] = reversedArray[binaryArray.length - 1 - i];
            //Assigns "reversedArray[binaryArray.length - 1 - i]" to "binaryArray[i]"
            //This is run 8 times from 7 to 0
        }

        return reversedArray;
        //Returns the value of the array "reversedArray"
    }

    /***** ARRAY SHIFTING METHOD *****/

    public void shiftRight() {
        //Defines a public void method titled "shiftRight()" which will shift the array to the right by one number

        int lastBit = binaryArray[binaryArray.length - 1];
        //Declares an integer-type variable titled "lastBit" which has been assigned the value of "binaryArray[binaryArray.length - 1]"

        for (int i = binaryArray.length - 1; i > 0; i--) {
            //Declares a "for" loop for the variable "i" which equals one value less than the length of array "binaryArray", the condition that "i" is greater than 0, and that "i" is decreasing by 1 using the post-decrement "i--"
            binaryArray[i] = binaryArray[i - 1];
            //Assigns "binaryArray[i - 1]" to "binaryArray[i]"
        }

        binaryArray[0] = lastBit;
        //Assigns the value of "lastBit" to the first position of the array "binaryArray"
    }

    /***** ARRAY SHUFFLING METHOD *****/

    public void shuffleArray() {
        //Defines a public void method titled "shuffleArray()" which will randomly shuffle the numbers of the array

        for (int i = binaryArray.length - 1; i > 0; i--) {
            //Declares a "for" loop for the variable "i" which equals one value less than the length of array "binaryArray", the condition that "i" is greater than 0, and that "i" is decreasing by 1 using the post-decrement "i--"
            int j = (int) (Math.random() * (i + 1));
            //Declares an integer-type variable titled "j" which is assigned a random value from 0 to i + 1
            //"(Math.random() * (i + 1))" is being cast as an integer-type variable so that the value of "j" is a whole number
            int temp = binaryArray[i];
            //Declares an integer-type variable titled "temp" which has been assigned the value of "binaryArray[i]"
            binaryArray[i] = binaryArray[j];
            //Assigns "binaryArray[j]" to "binaryArray[i]"
            binaryArray[j] = temp;
            //Assigns "temp" to "binaryArray[j]"
        }
    }
}
