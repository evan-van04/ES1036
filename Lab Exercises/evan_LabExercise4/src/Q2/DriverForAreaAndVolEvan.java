/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 2 of Lab Exercise 4 and the task of this question is to randomly generate a cylinder and cone's radius and height and calculate their respective volume and surface area using concepts of inheritance, polymorphism, and abstract methods.
 ******************************/

package Q2;
//Declares a package titled "Q2", which groups the classes "DriverForAreaAndVolEvan", "Geometric3DObject", "RightCircularCone", and "RightCylinder" and interface "VolumeOf3DObjectsInterface" into one folder

import LA3Q.*;
//Imports the methods/fields used in package "LA3Q"
//This class will be using the "myHeader" and "myFooter" methods from the "MyMethod" class within the "LA3Q" package

import java.util.Scanner;
//Imports the pre-existing "Scanner" class into the program from the java.util package

/***** CLASS *****/

public class DriverForAreaAndVolEvan {
    //Declares a class named "DriverForAreaAndVolEvan" which Java will need to use in order to run the program

    public static Scanner input = new Scanner(System.in);
    //Declares a public static Scanner-type field titled "input" which will allow the user to input their desired values

    /***** POPULATE ARRAYS METHOD *****/

    public static void populateArrays(Geometric3DObject[] x, int y) {
        //Declares a public static void-type method titled "populateArrays()" with arguments "x" as a "Geometric3DObject" array-type reference variable and "y" as an int-type reference variable
        //This method will populate the "Geometric3DObject" array-type reference variable "x" with randomly generated "r" and "h" values

        /***** CYLINDER VALUES *****/

        if(y == 1) {
            //Declares an "if" statement which will work on the cylinder-type object if "y" is equal to 1

            for(int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                double r = Math.random() + 2;
                //Generates a random value greater than or equal to 2 and less than 3 and assigns this value to the double-type variable "r"

                double h = Math.random() * 3 + 4;
                //Generates a random value greater than or equal to 4 and less than 7 and assigns this value to the double-type variable "h"

                x[i] = new RightCylinder(r, h);
                //Instantiates each array element with the constructor "RightCylinder" with "r" and "h" as parameters

            }

            /***** CONE VALUES *****/

        } else if(y == 2) {
            //Declares an "if" statement which will work on the cone-type object if "y" is equal to 2

            for(int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                double r = Math.random() + 2;
                //Generates a random value greater than or equal to 2 and less than 3 and assigns this value to the double-type variable "r"

                double h = Math.random() * 3 + 4;
                //Generates a random value greater than or equal to 4 and less than 7 and assigns this value to the double-type variable "h"

                x[i] = new RightCircularCone(r, h);
                //Instantiates each array element with the constructor "RightCircularCone" with "r" and "h" as parameters

            }

        }

    }
    /***** PRINT ARRAYS METHOD *****/

    public static void printArrays(Geometric3DObject[] x, int y) {
        //Declares a public static void-type method titled "printArrays()" with arguments "x" as a "Geometric3DObject" array-type reference variable and "y" as an int-type reference variable
        //This method will print the "Geometric3DObject" array-type reference variable "x" with the randomly generated "r" and "h" values

        /***** CYLINDER INFO *****/

        if(y == 1) {
            //Declares an "if" statement which will work on the cylinder-type object if "y" is equal to 1

            for(int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                System.out.println("Cylinder " + (i + 1) + ":");
                //Prints the header for each respective cylinder info

                System.out.println("-------------");
                //Prints the above text as a literal

                System.out.println(x[i]);
                //Displays the cylinder's radius, height, volume, and surface area by printing the array "x"

            }

            /***** CONE INFO *****/

        } else if(y == 2) {
            //Declares an "if" statement which will work on the cone-type object if "y" is equal to 2

            for(int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                System.out.println("Cone " + (i + 1) + ":");
                //Prints the header for each respective cone info

                System.out.println("-------------");
                //Prints the above text as a literal

                System.out.println(x[i]);
                //Displays the cone's radius, height, volume, and surface area by printing the array "x"

            }

        }

    }

    /***** MAX VOLUME METHOD *****/

    public static void maxVolume(Geometric3DObject[] x, int y) {
        //Declares a public static void-type method titled "maxVolume()" with arguments "x" as a "Geometric3DObject[]" array-type reference variable and "y" as an int-type reference variable
        //This method will determine the maximum volume from the cylinders and cones

        /***** MAXIMUM CYLINDER VOLUME *****/

        if (y == 1) {
            //Declares an "if" statement which will work on the cylinder-type object if "y" is equal to 1

            double maxVolumeCylinder = 0;
            //Declares a double-type variable titled "maxVolumeCylinder" and is assigned a value of 0

            for (int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                RightCylinder cylinder = (RightCylinder) x[i];
                //The "Geometric3DObject" instance "x[i]" is being casted to a "RightCylinder" instance and is assigned to the object reference "cylinder"

                    double volume = cylinder.getVolume();
                    //Calls the "getVolume()" method using the object reference "cylinder" and assigns this value to the double-type variable "volume"

                    if (volume > maxVolumeCylinder) {
                    //Declares an "if" statement that will assign the variable "volume" to variable "maxVolumeCylinder" if the condition "volume" > "maxVolumeCylinder" is true

                        maxVolumeCylinder = volume;
                        //Assigns variable "volume" to variable "maxVolumeCylinder"
                        //This constantly updates the new "maxVolumeCylinder" variable with the highest possible volume

                    }

            }

            System.out.printf("The cylinder with the maximum volume is %.2f cubic cm\n", maxVolumeCylinder);
            //Prints the maximum volume of the cylinders to 2 decimal places

        }

        /***** MAXIMUM CONE VOLUME *****/

        if (y == 2) {
            //Declares an "if" statement which will work on the cone-type object if "y" is equal to 2

            double maxVolumeCone = 0;
            //Declares a double-type variable titled "maxVolumeCone" and is assigned a value of 0

            for (int i = 0; i < x.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "x", and that "i" is increasing by 1 using the post-increment "i++"

                RightCircularCone cone = (RightCircularCone) x[i];
                //The "Geometric3DObject" instance "x[i]" is being casted to a "RightCircularCone" instance and is assigned to the object reference "cone"

                double volume = cone.getVolume();
                //Calls the "getVolume()" method using the object reference "cone" and assigns this value to the double-type variable "volume"

                if (volume > maxVolumeCone) {
                    //Declares an "if" statement that will assign the variable "volume" to variable "maxVolumeCone" if the condition "volume" > "maxVolumeCone" is true

                        maxVolumeCone = volume;
                        //Assigns variable "volume" to variable "maxVolumeCone"
                        //This constantly updates the new "maxVolumeCone" variable with the highest possible volume

                    }
            }

            System.out.printf("The cone with the maximum volume is %.2f cubic cm\n", maxVolumeCone);
            //Prints the maximum volume of the cones to 2 decimal places

        }


    }

    /***** DRIVER METHOD *****/

    public static void main(String[] args) {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method

        /***** HEADER METHOD *****/

        MyMethod.myHeader(4, 2, "The task of this question is to randomly generate a cylinder and cone's radius and height and calculate their respective volume and surface area using concepts of inheritance, polymorphism, and abstract methods.");
        //Calls the method "myHeader()" method from the "MyMethod" class and defines the parameters "labNum", "questionNum", and "description" with the appropriate values

        /***** CYLINDER INFO *****/

        System.out.print("How many Cylindrical objects you need to measure: ");
        //Prints the above text as a literal

        int n = input.nextInt();
        //Assigns the value the user inputted to int-type variable "n"

        Geometric3DObject[] cylinder = new Geometric3DObject[n];
        //Declares a "Geometric3DObject" type array reference variable titled "cylinder" with length "n"

        populateArrays(cylinder, 1);
        //Calls the "populateArrays()" method with "cylinder" and "1" as its arguments

        printArrays(cylinder, 1);
        //Calls the "printArrays()" method with "cylinder" and "1" as its arguments

        maxVolume(cylinder, 1);
        //Calls the "maxVolume()" method with "cylinder" and "1" as its arguments

        System.out.println("=====================================================");
        //Prints the above text as a literal

        /***** CONE INFO *****/

        System.out.print("How many Conical objects you need to measure: ");
        //Prints the above text as a literal

        int m = input.nextInt();
        //Assigns the value the user inputted to int-type variable "m"

        Geometric3DObject[] cone = new Geometric3DObject[m];
        //Declares a "Geometric3DObject" type array reference variable titled "cone" with length "m"

        populateArrays(cone, 2);
        //Calls the "populateArrays()" method with "cone" and "2" as its arguments

        printArrays(cone, 2);
        //Calls the "printArrays()" method with "cone" and "2" as its arguments

        maxVolume(cone, 2);
        //Calls the "maxVolume()" method with "cone" and "2" as its arguments

        /***** FOOTER METHOD *****/

        MyMethod.myFooter(2);
        //Calls the "myFooter()" method from the "MyMethod" class

    }

}
