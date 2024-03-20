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

public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface {
    //Declares a class named "RightCircularCone" which is a child class of "Geometric3DObject" and implements the interface "VolumeOf3DObjectsInterface"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public RightCircularCone() {}
    //Declares a constructor without arguments titled "RightCircularCone"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public RightCircularCone(double r, double h) {
        //Declares a constructor titled "RightCircularCone" with arguments "r" and "h" as double-type reference variables

        super(r, h);
        //Uses the "super" keyword to access the super class's constructor with arguments "r" and "h"

    }

    /***** CALCULATE AREA *****/

    public double getArea() {
        //Declares a public double-type method titled "getArea()"
        //This method will calculate and return the area of a cone

        double r = super.getR();
        //Calls the super class's method "getR()" and assigns it to the double-type variable "r"

        double h = super.getH();
        //Calls the super class's method "getH()" and assigns it to the double-type variable "h"

        return (MyMethod.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2))));
        //Uses the formula for area of a cone to calculate the area
        //Uses the declared field "PI" from the "MyMethod" class to access the value of pi instead of using "Math.PI"

    }

    /***** CALCULATE VOLUME *****/

    public double getVolume() {
        //Declares a public double-type method titled "getVolume()"
        //This method will calculate and return the volume of a cone

        double r = super.getR();
        //Calls the super class's method "getR()" and assigns it to the double-type variable "r"

        double h = super.getH();
        //Calls the super class's method "getH()" and assigns it to the double-type variable "h"

        return ((MyMethod.PI * Math.pow(r, 2) * h) / 3);
        //Uses the formula for volume of a cone to calculate the area
        //Uses the declared field "PI" from the "MyMethod" class to access the value of pi instead of using "Math.PI"

    }

    /***** DISPLAYS CONE'S INFO *****/

    @Override
    public String toString() {
        //Declares a public String-type method titled "toString()"
        //This method will print the cone's info

        return String.format(super.toString() + "\nCone's Volume: %.2f cubic cm\nCone's surface area: %.2f sq. cm\n", getVolume(), getArea());
        //Returns the super class's "toString()" method and the cone's volume and area

    }

}
