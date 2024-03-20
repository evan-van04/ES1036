/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 27, 2023
 Description: This is question 1 of Lab Exercise 2 and the task of this question is to print students' student numbers, full names, number grades, and letter grades through the use of conditional "if" and "else" statements
 ******************************/

package Q1;
//Declares a package titled Q1, which groups the classes "Student" and "StudentGradesByEvan" into one folder

public class Student {
    //Creating a class named "Student" which Java will need to use in order to run the program

    /***** Methods *****/

    private String name;
    //Defines the method "name" as a String type data field with a private access modifier

    private int studentNumber;
    //Defines the method "studentNumber" as an integer type data field with a private access modifier

    private int score;
    //Defines the method "score" as an integer type data field with a private access modifier

    /***** Constructor without parameters *****/

    public Student() {
        //Declares a public constructor with no parameters titled "Student"

        name = "Evan Van";
        //Assigns my name to the field "name"

        studentNumber = 251287806;
        //Assigns my student number to the field "studentNumber"

        score = 100;
        //Assigns my grade to the field "score"

    }

    /***** Constructor with parameters *****/

    public Student(String nm, int sn, int sc) {
        //Declares a constructor with parameters nm, sn, and sc as arguments

        name = nm;
        //Assigns the variable "nm" to the field "name"

        studentNumber = sn;
        //Assigns the variable "sn" to the field "studentNumber"

        score = sc;
        //Assigns the variable "sc" to the field "score"
    }

    /***** Method *****/

    public void printInfo() {
        //Defines the method printInfo() as void with a public access modifier

        System.out.printf("%-20s%-20d%-3d (Letter Grade: %-2s)", name, studentNumber, score, getLetterGrade());
        //Using the printf() method, the program prints the student's full name, student number, and score with field widths of -20, -20, and -3 respectively
    }

    /***** Accessor/Getter Methods *****/

    public String getName() {
        //Defines the method getName() as a String type data field with a public access modifier

        return name;
        //Returns the name of the student
    }

    public int getScore() {
        //Defines the method getScore() as an integer type data field with a public access modifier

        return score;
        //Returns the score of the student
    }

    /***** Mutator/Setter Methods *****/

    public void setName(String nm) {
        //Defines the method setName() with the argument "nm" as void with a public access modifier

        name = nm;
        //Assigns the variable "nm" to the field "name"
    }

    public void setStudentNumber(int sn) {
        //Defines the method setStudentNumber() with the argument "sn" as void with a public access modifier

        studentNumber = sn;
        //Assigns the variable "sn" to the field "studentNumber"
    }

    public void setScore(int sc) {
        //Defines the method setScore() with the argument "sc" as void with a public access modifier

        score = sc;
        //Assigns the variable "sc" to the field "score"
    }

    /***** Accessor/Getter Method *****/

    public String getLetterGrade() {
        //Defines the method getLetterGrade as a String type data field with a public access modifier

        String letterGrade;
        //Defines the variable "letterGrade" as a String type data field

        if (score >= 90)
            letterGrade = "A+";
            //States that if the student's score is greater than or equal to 90, then the letter grade is an A+

        else if (score >= 80)
            letterGrade = "A-";
            //States that if the student's score is between 80-89, then the letter grade is an A-

        else if (score >= 70)
            letterGrade = "B+";
            //States that if the student's score is between 70-79, then the letter grade is a B+

        else if (score >= 60)
            letterGrade = "B-";
            //States that if the student's score is between 60-69, then the letter grade is a B-

        else if (score >= 50)
            letterGrade = "C+";
            //States that if the student's score is between 50-59, then the letter grade is a C+

        else if (score >= 40)
            letterGrade = "C-";
            //States that if the student's score is between 40-49, then the letter grade is a C-

        else if (score >= 30)
            letterGrade = "D";
            //States that if the student's score is between 30-39, then the letter grade is a D

        else
            letterGrade = "F";
            //States that if the student's score is between 0-29, then the letter grade is an F

        return letterGrade;
        //Returns the student's respective letter grade depending on their inputted numerical score
        //If the first "if" statement is false, then the program moves onto the next "if" statement until it reaches an "if" statement that is true
            //If no "if" statements is true, then the program assigns the letter grade as "F" by default
    }
}