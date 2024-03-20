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
//This class will be using the field "PI" declared in the "MyMethod" class within the "LA3Q" package

/***** CLASS *****/

public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface {
    //Declares a class named "RightCylinder" which is a child class of "Geometric3DObject" and implements the interface "VolumeOf3DObjectsInterface"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public RightCylinder() {}
    //Declares a constructor without arguments titled "RightCylinder"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public RightCylinder(double r, double h) {
        //Declares a constructor titled "RightCylinder" with arguments "r" and "h" as double-type reference variables

        super(r, h);
        //Uses the "super" keyword to access the super class's constructor with arguments "r" and "h"

    }

    /***** CALCULATE AREA *****/

    public double getArea() {
        //Declares a public double-type method titled "getArea()"
        //This method will calculate and return the area of a cylinder

        double r = super.getR();
        //Calls the super class's method "getR()" and assigns it to the double-type variable "r"

        double h = super.getH();
        //Calls the super class's method "getH()" and assigns it to the double-type variable "h"

        return (2 * MyMethod.PI * r * (r + h));
        //Uses the formula for area of a cylinder to calculate the area
        //Uses the declared field "PI" from the "MyMethod" class to access the value of pi instead of using "Math.PI"

    }

    /***** CALCULATE VOLUME *****/

    public double getVolume() {
        //Declares a public double-type method titled "getVolume()"
        //This method will calculate and return the volume of a cylinder

        double r = super.getR();
        //Calls the super class's method "getR()" and assigns it to the double-type variable "r"

        double h = super.getH();
        //Calls the super class's method "getH()" and assigns it to the double-type variable "h"

        return (MyMethod.PI * Math.pow(r, 2) * h);
        //Uses the formula for volume of a cylinder to calculate the volume
        //Uses the declared field "PI" from the "MyMethod" class to access the value of pi instead of using "Math.PI"

    }

    /***** DISPLAYS CYLINDER'S INFO *****/

    @Override
    public String toString() {
        //Declares a public String-type method titled "toString()"
        //This method will print the cylinder's info

        return String.format(super.toString() + "\nCylinder's Volume: %.2f cubic cm\nCylinder's surface area: %.2f sq. cm\n", getVolume(), getArea());
        //Returns the super class's "toString()" method and the cylinder's volume and area

    }

}
