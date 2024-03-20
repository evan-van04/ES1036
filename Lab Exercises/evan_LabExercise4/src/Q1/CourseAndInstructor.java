/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

/***** CLASS *****/

public class CourseAndInstructor extends InstructorInfo {
    //Declares a class named "CourseAndInstructor" which is a child class of "InstructorInfo"

    /***** FIELD *****/

    private String courseName;
    //Declares a private String-type field titled "courseName"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public CourseAndInstructor() {}
    //Declares a public constructor without arguments titled "CourseAndInstructor()"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public CourseAndInstructor(String cN, String fN, String lN, String oL) {
        //Declares a constructor titled "CourseAndInstructor()" with arguments "cN", "fN", "lN", and "oL" as String-type variables

        super(fN, lN, oL);
        //Uses the "super" keyword to access the super class's constructor with arguments "fN", "lN", and "oL"

        courseName = cN;
        //Assigns the variable "cN" to field "courseName"

    }

    /***** DISPLAYS THE COURSE NAME *****/

    public String toString() {
        //Declares a public String-type method titled "toString()"

        return "\nCourse Name: " + courseName + super.toString();
        //Returns the course name and super class's "toString()" method

    }

}
