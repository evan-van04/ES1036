/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

/***** CLASS *****/

public class Name {
    //Declares a class named "Name" which Java will need to use in order to run the program

    /***** FIELDS *****/

    private String firstName;
    //Declares a private String-type field titled "firstName"

    private String lastName;
    //Declares a private String-type field titled "lastName"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public Name() {}
    //Declares a public constructor without arguments titled "Name()"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public Name(String firstName, String lastName) {
        //Declares a constructor titled "Name()" with arguments "firstName" and "lastName" as String-type variables

        this.firstName = firstName;
        //Assigns the variable "firstName" to the field "firstName" using the "this" keyword
        //The "this" keyword is used to refer the object "firstName" from inside its class

        this.lastName = lastName;
        //Assigns the variable "lastName" to the field "lastName" using the "this" keyword
        //The "this" keyword is used to refer the object "lastName" from inside its class

    }

    /***** DISPLAYS THE STUDENT'S FIRST AND LAST NAME *****/

    public String toString() {
        //Declares a public String-type method titled "toString()"

        return String.format("Name: " + firstName + " " + lastName);
        //Returns the student's first and last name

    }

}

