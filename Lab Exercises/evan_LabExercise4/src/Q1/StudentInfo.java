/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

/***** CLASS *****/

public class StudentInfo extends Name{
    //Declares a class named "StudentInfo" which is a child class of "Name"

    /***** FIELDS *****/

    private int studentNumber;
    //Declares a private int-type field titled "studentNumber"

    private CourseAndInstructor courseInfo;
    //Declares a private CourseAndInstructor-type field titled "courseInfo"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public StudentInfo() {}
    //Declares a public constructor without arguments titled "StudentInfo()"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo) {
        //Declares a constructor titled "StudentInfo()" with arguments "fN" and "lN as String-type variables, "sN" as an int-type variable, and "cInfo" as a "CourseAndInstructor" type variable

        super(fN, lN);
        //Uses the "super" keyword to access the super class's constructor with arguments "fN" and "lN"

        studentNumber = sN;
        //Assigns the variable "sN" to field "studentNumber"

        courseInfo = cInfo;
        //Assigns the variable "cInfo" to field "courseInfo"

    }

    /***** DISPLAYS THE STUDENT NUMBER AND COURSE INFO *****/

    public String toString() {
        //Declares a public String-type method titled "toString()"

        return String.format(super.toString() + "\nStudent Number: " + studentNumber + courseInfo);
        //Returns the super class's "toString()" method, the student's student number, and the course info

    }

}
