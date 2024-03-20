/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 27, 2023
 Description: This is question 2 of Lab Exercise 2 and the task of this question is to display the mathematical concept of imaginary numbers and their sum, product, magnitude, and angle through the use of conditional "if" and "else" statements.
 ******************************/

package Q2;
//Declares a package titled Q2, which groups the classes "ComplexNumber" and "ComplexNumberDemoEvan" into one folder

public class ComplexNumber {
    //Creating a class named "ComplexNumber" which Java will need to use in order to run the program

    /***** Methods *****/

    private double real;
    //Defines the method "real" as a double type data field with a private access modifier

    private double imaginary;
    //Defines the method "imaginary" as a double type data field with a private access modifier

    /***** Constructor Without Parameters *****/

    public ComplexNumber() {
        //Declares a public constructor titled "ComplexNumber" without arguments
        real = 0;
        //Assigns a value of 0 to the field "real"
        imaginary = 0;
        //Assigns a value of 0 to the field "imaginary"
    }

    /***** Constructor With Parameters *****/

    public ComplexNumber(double re, double im) {
        //Declares a public constructor titled "ComplexNumber" with arguments "double re" and "double im"
        real = re;
        //Assigns the variable "re" to the field "real"
        imaginary = im;
        //Assigns the variable "im" to the field "imaginary"
    }

    /***** Accessor/Getter Methods *****/

    public double getReal() {
        //Defines the getter method getReal() with a double type field and public access modifier
        return real;
        //Returns the value of the real number
    }

    public double getImaginary() {
        //Defines the getter method getImaginary() with a double type field and a public access modifier
        return imaginary;
        //Returns the value of the imaginary number
    }

    public double getMagnitude() {
        //Defines the getter method getMagnitude() with a double type field and a public access modifier
        double magnitude = Math.sqrt(Math.pow(real,2) + Math.pow(imaginary,2));
        //Calculates the magnitude of the complex number
        return magnitude;
        //Returns the magnitude of the complex number
    }

    public double getAngle() {
        //Defines the getter method getAngle() with a double type field and a public access modifier
        double angle = Math.toDegrees(Math.atan2(imaginary, real));
        //Calculates the angle of the complex number in degrees
        return angle;
        //Returns the angle of the complex number in degrees
    }

    /**** Prints the User's Complex Number *****/

    public void displayRecForm() {
        //Defines the method displayRecForm() with a double type field and a public access modifier
        if (imaginary > 0)
            System.out.printf("%.2f + %.2fi",real, imaginary);
        //Prints the above message if the value of the imaginary number is greater than 0
        else if (imaginary < 0)
            System.out.printf("%.2f - %.2fi",real, Math.abs(imaginary));
        //Prints the above message if the value of the imaginary number is less than 0
        else
            System.out.printf("%.2f + %.2fi",real, imaginary);
        //Prints the above message if the value of the imaginary number is equal to 0
    }
}
