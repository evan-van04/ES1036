/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 2 of Lab Exercise 4 and the task of this question is to randomly generate a cylinder and cone's radius and height and calculate their respective volume and surface area using concepts of inheritance, polymorphism, and abstract methods.
 ******************************/

package Q2;
//Declares a package titled "Q2", which groups the classes "DriverForAreaAndVolEvan", "Geometric3DObject", "RightCircularCone", and "RightCylinder" and interface "VolumeOf3DObjectsInterface" into one folder

/***** CLASS *****/

public abstract class Geometric3DObject {
    //Declares an abstract class named "Geometric3DObject" which Java will need to use in order to run the program
    //Unlike regular classes, abstract classes cannot be instantiated directly; however, they can contain both abstract and non-abstract methods

    /***** FIELDS *****/

    private double r;
    //Declares "r" as a private double-type field

    private double h;
    //Declares "h" as a private double-type field

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    protected Geometric3DObject() {}
    //Declares a protected-type constructor titled "Geometric3DObject" without arguments

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    protected Geometric3DObject(double r, double h) {
        //Declares a protected-type constructor titled "Geometric3DObject" with arguments "r" and "h" as double-type reference variables

        this.r = r;
        //Uses the "this" keyword to assign "r" in the constructor header to the private double-type field "r"
        //The "this" keyword is used since there are two variables/fields with the same name

        this.h = h;
        //Uses the "this" keyword to assign "h" in the constructor header to the private double-type field "h"
        //The "this" keyword is used since there are two variables/fields with the same name

    }

    /***** GET R METHOD *****/

    public double getR() {
        //Declares a public double-type method titled "getR()"

        return r;
        //Returns the value of variable "r"

    }

    /***** GET H METHOD *****/

    public double getH() {
        //Declares a public double-type method titled "getH()"

        return h;
        //Returns the value of variable "h"

    }

    /***** GET AREA METHOD *****/

    public abstract double getArea();
    //Declares a public abstract double-type method titled "getArea()"

    /***** DISPLAYS CYLINDER'S/CONE'S RADIUS AND HEIGHT *****/

    public String toString() {
        //Declares a public String-type method titled "toString()"
        //This method will print the cylinder's/cone's randomly generated radius and height

        return String.format("Given: Radius = %.2f cm, Height = %.2f cm", r, h);
        //Returns the randomly generated radius and height of the cylinder/cone

    }

}
