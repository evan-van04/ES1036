/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

/***** CLASS *****/

public class InstructorInfo extends Name {
    //Declares a class named "InstructorInfo" which is a child class of "Name"

    /***** FIELD *****/

    private String officeLocation;
    //Declares a private String-type field titled "officeLocation"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public InstructorInfo() {}
    //Declares a public constructor without arguments titled "InstructorInfo()"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public InstructorInfo(String fN, String lN, String oL) {
        //Declares a constructor titled "InstructorInfo()" with arguments "fN", "lN", and "oL" as String-type variables

        super(fN, lN);
        //Uses the "super" keyword to access the super class's constructor with arguments "fN" and "lN"

        officeLocation = oL;
        //Assigns the variable "oL" to field "officeLocation"

    }

    /***** DISPLAYS THE INSTRUCTOR INFO AND OFFICE LOCATION *****/

    public String toString() {
        //Declares a public String-type method titled "toString()"

        return String.format("\nInstructor's Info:\n" + super.toString() + "\nOffice Location: " + officeLocation);
        //Returns the instructor's info, the super class's "toString()" method", and their office location

    }

}
