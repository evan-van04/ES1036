/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 20, 2023
 Description: This is question 2 of Lab Exercise 2 and the task of this question is to print mine and two other students' student number, first name, last name, email address, and ear of birth through the use of constructors.
 ******************************/

package Q2;
//Declares a package titled Q2, which groups the classes "Student" and "StudentDemoClassEvan" into one folder

import Q1.CircleInfoEvan;
//Imports the header and footer methods from the Java class "CircleInfoEvan" from package Q1

public class StudentDemoClassEvan {
    //Creating a class named "StudentDemoClassEvan" which Java will need to use in order to run the program

    /***** Driver method *****/

    public static void main(String[] args) {

        /***** Calls the header method *****/

        CircleInfoEvan.myHeader(2, 2, "This is question 2 of Lab Assignment 2 and the task of this question is to print mine and two other students' student number, first name, last name, email address, and ear of birth through the use of constructors.");
        //Calls the method "myHeader" from Q1 and assigns the parameters "labNum," "questionNum," and "description" with the appropriate values

        /***** Student type reference variable *****/

        Student s = new Student();
        //Creates a Student type reference variable and instantiates the Student object

        /***** Prints my information *****/

        System.out.printf("Here is my information:\n=======================\nI am %s\nStudent Number: %d\nEmail address: %s\nAge: %d\n\n", s.getName(), s.getStudentNumber(), s.getEmailAddress(), s.getAge());
        //Prints my information including my full name, student number, email address, and age using the printf() method

        /***** Prints the other students' information *****/

        Student addieInfo = new Student(250221375, "Addie", "Slowgrave");
        //The constructor titled "addieInfo" initializes and declares values for the fields "sn," "fName," and "lName"
        Student taliaInfo = new Student(250309716, "Talia", "Hanscom");
        //The constructor titled "taliaInfo" initializes and declares values for the fields "sn," "fName," and "lName"
        System.out.printf("Here is the info on other students:\n==========================\nNumber\t  Name\n========= ================\n%d%16s\n%d%14s\n==========================\n", addieInfo.getStudentNumber(), addieInfo.getName(), taliaInfo.getStudentNumber(), taliaInfo.getName());
        //Prints the two students' information including their full name and student number using the printf() method

        /***** Calls the footer method *****/

        CircleInfoEvan.myFooter(2);
        //Calls the method "myFooter" from Q1 and assigns the parameter "questionNum" with the appropriate value
    }
}