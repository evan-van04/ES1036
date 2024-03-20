/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

import LA3Q.*;
//Imports the methods used in package "LA3Q"
//In this program, only the methods "myHeader()" and "myFooter()" are being called

/***** CLASS *****/

public class DemoCourseGradeEvan {
    //Declares a class named "DemoCourseGradeEvan" which Java will need to use in order to run the program

    /***** DRIVER METHOD *****/

    public static void main(String[] args) {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method

        /***** HEADER METHOD *****/

        MyMethod.myHeader(4, 1, "The task of this question is to display a student's and their professor's info and calculate the student's course-grade using concepts of inheritance and polymorphism.");
        //Calls the method "myHeader()" method from the "MyMethod" class and defines the parameters "labNum", "questionNum", and "description" with the appropriate values

        /***** STUDENT, COURSE, AND INSTRUCTOR INFO *****/

        CourseAndInstructor c = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB 263");
        //Declares a reference variable of "CourseAndInstructor" type and is instantiated with the course name and Instructor's first name, last name, and office location

        StudentInfo s = new StudentInfo("Evan", "Van", 251287806, c);
        //Declares a reference variable of "StudentInfo" and is instantiated with the student's first name, last name, student number, and "CourseAndInstructor" type reference variable "c"

        System.out.print("Student ");
        //Prints the above text as a literal

        System.out.println(s);
        //Prints the associated values of the "StudentInfo" reference variable

        /***** SCORE CARD TITLE *****/

        System.out.println("=============================================");
        //Prints the above text as a literal

        System.out.println("   Score Card (Based on the rounded Score)");
        //Prints the above text as a literal

        System.out.println("=============================================");
        //Prints the above text as a literal

        /***** LAB GRADE *****/

        double[] labG = new double[] {15, 15, 15, 15, 15, 15, 15};
        //Declares a double-type array reference variable titled "labG" which has been populated with the 7 lab grades

        GradeActivity avgLabG = new GradeActivity(labG, 15);
        //Declares a "GradeActivity" type reference variable and is instantiated with the "labG" array reference variable and the maximum possible grade of 15

        System.out.print("Lab Grade: ");
        //Prints the above text as a literal

        System.out.println(avgLabG);
        //Prints the average lab grade on the screen by calling the "GradeActivity" reference variable titled "avgLabG"

        /***** IN-LAB QUIZ GRADE *****/

        double[] quizG = new double[] {14.17, 18.33, 18};
        //Declares a double-type array reference variable titled "quizG" which has been populated with the best 3 in-lab quiz grades

        GradeActivity avgQuizG = new GradeActivity(quizG, 20);
        //Declares a "GradeActivity" type reference variable and is instantiated with the "quizG" array reference variable and the maximum possible grade of 20

        System.out.print("Quiz Grade: ");
        //Prints the above text as a literal

        System.out.println(avgQuizG);
        //Prints the average in-lab quiz grade on the screen by calling the "GradeActivity" reference variable titled "avgQuizG"

        /***** MIDTERM GRADE *****/

        GradeActivity midtermG = new GradeActivity(21.07, 25);
        //Declares a "GradeActivity" type reference variable and is instantiated with a score of 21.07 and the maximum possible grade of 25

        System.out.print("Midterm Grade: ");
        //Prints the above text as a literal

        System.out.println(midtermG);
        //Prints the midterm grade on the screen by calling the "GradeActivity" reference variable titled "midtermG"

        GradeActivity finalG = new GradeActivity(33.71, 40);
        //Declares a "GradeActivity" type reference variable and is instantiated with a score of 33.71 and the maximum possible grade of 40

        /***** FINAL GRADE *****/

        System.out.print("Final Grade: ");
        //Prints the above text as a literal

        System.out.println(finalG);
        //Prints the expected final grade on the screen by calling the "GradeActivity" reference variable titled "finalG"

        double[] finalScore = new double[] {15.00, 16.83, 21.07, 33.71};
        //Declares a double-type array reference variable titled "finalScore" which has been populated with the 4 assessment grades

        GradeActivity courseG = new GradeActivity(finalScore, 100);
        //Declares a "GradeActivity" type reference variable and is instantiated with the "finalScore" array reference variable and the maximum possible grade of 100

        /***** FINAL COURSE GRADE *****/

        System.out.println("============================================================");
        //Prints the above text as a literal

        System.out.print("Course Grade: ");
        //Prints the above text as a literal

        System.out.println(courseG);
        //Prints the final course grade on the screen by calling the "GradeActivity" reference variable titled "courseG"

        System.out.println("============================================================");
        //Prints the above text as a literal

        /***** BONUS QUIZ GRADE *****/

        GradeActivity avgBonusG = new GradeActivity(4.76, 5);
        //Declares a "GradeActivity" type reference variable and is instantiated with a score of 4.76 and the maximum possible grade of 5

        System.out.print("Average Bonus Grade: ");
        //Prints the above text as a literal

        System.out.println(avgBonusG);
        //Prints the average bonus quiz grade on the screen by calling the "GradeActivity" reference variable titled "avgBonusG"

        /***** REPORTED FINAL GRADE (WITH BONUS) *****/

        GradeActivity reportedFinalG = new GradeActivity(91.37, 100);
        //Declares a "GradeActivity" type reference variable and is instantiated with a score of 91.37 and the maximum possible grade of 100

        System.out.print("Reported Final Grade (with bonus): ");
        //Prints the above text as a literal

        System.out.println(reportedFinalG);
        //Prints the final course grade with the additional bonus quiz grade on the screen by calling the "GradeActivity" reference variable titled "reportedFinalG"

        System.out.println("==========================================================================");
        //Prints the above text as a literal

        /***** FOOTER METHOD *****/

        MyMethod.myFooter(1);
        //Calls the "myFooter()" method from the "MyMethod" class

    }

}
