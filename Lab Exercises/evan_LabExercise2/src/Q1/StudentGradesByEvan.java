/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 27, 2023
 Description: This is question 1 of Lab Exercise 2 and the task of this question is to print students' student numbers, full names, number grades, and letter grades through the use of conditional "if" and "else" statements.
 ******************************/

package Q1;
//Declares a package titled Q1, which groups the classes "Student" and "StudentGradesByEvan" into one folder

import java.util.Scanner;
//Imports a pre-existing Scanner class into the program from the java.util package

public class StudentGradesByEvan {
    //Creating a class named "StudentGradesByEvan" which Java will need to use in order to run the program

    public static Scanner input = new Scanner(System.in);
    //Declares a Scanner type field called "input"
    public static int counter = 0;
    //Declares a field called "counter" and assigns the value to zero
    //This field will keep count of the number of students inside the dataEntry() method

    /***** Student Information Input *****/

    public static void dataEntry(Student s) {
        //Declares a method called dataEntry() with argument "Student s"
        counter++;
        //Increments the integer type field, "counter," by +1
        System.out.print("Enter Student Number: ");
        //Prompts the user to enter a student's student number
        int studentNumber = input.nextInt();
        //Assigns the value the user inputted as variable "studentNumber"
        input.nextLine();
        //Buffer-clearing dummy-call
        System.out.print("Enter Student's full name: ");
        //Prompts the user to enter a student's full name
        String name = input.nextLine();
        //Assigns the value the user inputted as variable "name"
        System.out.print("Enter " +name+ "'s score: ");
        //Prompts the user to enter a student's score
        int score = input.nextInt();
        //Assigns the value the user inputted as variable "score"
        input.nextLine();
        //Buffer-clearing dummy-call
        s.setStudentNumber(studentNumber);
        //Sets the student's student number to "s" using the setter method setStudentNumber()
        s.setName(name);
        //Sets the student's name to "s" using the setter method setName()
        s.setScore(score);
        //Sets the student's score to "s" using the setter method setScore()
    }

    public static int compareGrades(Student s1, Student s2) {
        //Declares a method called compareGrades() with arguments "Student s1" and "Student s2"
        if (s1.getScore() > s2.getScore())
            return 1;
        //If student 1's score is greater than student 2's score, the program will return a value of 1
        else if (s1.getScore() < s2.getScore())
            return -1;
        //If student 1's score is less than student 2's score, the program will return a value of -1
        else
            return 0;
        //If both students' scores are equal, then the program will return a value of 0
    }

    /***** Header Method *****/

    public static void myHeader(int labNum, int questionNum, String description) {
        //Defines a method called "myHeader" which contains 3 variables: "labNum", "questionNum", and "description"
        System.out.println("****************************************************");
        System.out.println("Full Name: Evan Van");
        //Prints my name as a literal
        System.out.println("Lab Exercise: " + labNum + ", Question: " + questionNum);
        //Prints the lab exercise and question number using variables "labNum" and "questionNum"
        System.out.println("Program Description: " + description);
        //Prints the description of the program using the variable "description"
        System.out.println("*****************************************************");
    }

    /***** Footer Method *****/

    public static void myFooter(int questionNum) {
        //Defines a method called myFooter, containing the variable "questionNum" as an integer
        System.out.println("*** Signing off from Question " + questionNum + " – Evan ***");
        //Prints a concluding statement using the variable "questionNum"
    }

    /***** Driver Method *****/

    public static void main(String[] args) {
        //main() is used as an entry point in Java and all Java programs require a main method

        /***** Calls the header method *****/

        myHeader(2, 1, "The task of this question is to print students' student numbers, full names, number grades, and letter grades through the use of conditional 'if' and 'else' statements.");
        //Calls the method "myHeader" and defines the parameters "labNum," "questionNum," and "description" with the appropriate values

        /***** Prints My Info *****/

        Student s1 = new Student();
        //Creates a Student type reference variable called "s1" and instantiates the Student object
        System.out.println("Here is my grade-info:");
        //Prints the message "Here is my grade-info:"
        s1.printInfo();
        //Prints my info by calling the printInfo() method

        /***** User Prompt *****/

        Student s2 = new Student();
        //Creates a second Student type reference variable called "s2" and instantiates the Student object
        System.out.println("\n\nData entry follows.....\n");
        //Prints the message "Data entry follows....." as a literal to the user
        System.out.println("Student 1:");
        //Prints the message "Student 1:" as a literal to the user
        dataEntry(s1);
        //Calls the dataEntry() method for s1 and populates the student objects that are referred to by s1
        System.out.println("\nStudent 2:");
        //Prints the message "Student 2:" as a literal to the user
        dataEntry(s2);
        //Calls the dataEntry() method for s2 and populates the student objects that are referred to by s2

        /***** Prints Students' Info *****/

        System.out.println("\nHere is the detail info..");
        //Prints the message "Here is the detail info.." as a literal to the user
        System.out.printf("%-20s%-20s%-3s\n", "Name", "Student Number", "Score (Letter Grade)");
        //Prints the text: Name, Student Number, and Score (Letter Grade) as a literal to the user using the printf() method
        //Uses field width to achieve the appropriate spacing between the headings
        System.out.println("---------------------------------------------------------------");
        s1.printInfo();
        //Prints student 1's info by calling the printInfo() method from the Student class
        System.out.println("");
        s2.printInfo();
        //Prints student 2's info by calling the printInfo() method from the Student class
        System.out.println("\n---------------------------------------------------------------");

        /***** Prints the Grade Comparison *****/

        int comparisonResult = compareGrades(s1, s2);
        //Calls the compareGrade() method with arguments "s1" and "s2" and assigns it to the integer type field called "comparisonResult"
        if (comparisonResult > 0)
            System.out.printf("Note: %s scored higher than %s.\n", s1.getName(), s2.getName());
        //If the method compareGrade() returns a value greater than 0, then the program will display the above message
        else if (comparisonResult < 0)
            System.out.printf("Note: %s scored higher than %s.\n", s2.getName(), s1.getName());
        //If the method compareGrade() returns a value less than 0, then the program will display the above message
        else
            System.out.println("Note: Their scores are equal!");
        //If the method compareGrade() returns a value of 0, then the program will display the above message

        /***** Calls the Footer Method *****/

        myFooter(1);
        //Calls the myFooter() method
    }
}
