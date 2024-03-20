/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 2 of Lab Exercise 4 and the task of this question is to randomly generate a cylinder and cone's radius and height and calculate their respective volume and surface area using concepts of inheritance, polymorphism, and abstract methods.
 ******************************/

package Q2;
//Declares a package titled "Q2", which groups the classes "DriverForAreaAndVolEvan", "Geometric3DObject", "RightCircularCone", and "RightCylinder" and interface "VolumeOf3DObjectsInterface" into one folder

/***** INTERFACE *****/

public interface VolumeOf3DObjectsInterface {
    //Declares an interface named "VolumeOf3DObjectsInterface" which Java will need to use in order to run the program
    //In Java, an interface can contain public constants which are all final-type and abstract methods

    /***** GET VOLUME METHOD *****/

    public abstract double getVolume();
    //Declares a public abstract double-type method titled "getVolume()"

}
