/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 20, 2023
 Description: This is question 1 of Lab Exercise 2 and the task of this question is to to prompt the user to input a radius value, and print that value along with its respective area, diameter, and circumference through the use of constructors.
 ******************************/

package Q1;
//Declares a package titled Q1, which groups the classes "Circle" and "CircleInfoEvan" into one folder

public class Circle {
    //Creating a class named "Circle" which Java will need to use in order to run the program

    /***** Method *****/

    public double radius;
    //Defines the method "radius" as a double type data field with a public access modifier

        /***** Constructors *****/

        public void setRadius(double rad) {
            //setRadius() is a mutator/setter method to set the radius field value
            radius = rad;
            //Declares that the data type field radius is equivalent to the variable "rad"
        }
        public double getRadius() {
            //getRadius() is an accessor/setter method to access the radius field
            return radius;
            //Returns the value of the radius
        }
        public double getArea() {
            //getArea() will return the area of the circle
            return Math.PI * Math.pow(radius, 2);
            //Returns the area of the circle using: Area = pi * radius * radius
        }
        public double getDiameter() {
            //getDiameter() will return the diameter of the circle
            return radius * 2;
            //Returns the diameter of the circle using: Diameter = radius * 2
        }
        public double getCircumference() {
            //getCircumference() will return the circumference of the circle
            return 2 * Math.PI * radius;
            //Returns the circumference of the circle using: Circumference = 2 * pi * radius
        }
}