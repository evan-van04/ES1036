/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: February 20, 2023
 Description: This is question 2 of Lab Exercise 2 and the task of this question is to print mine and two other students' student number, first name, last name, email address, and ear of birth through the use of constructors.
 ******************************/

package Q2;
//Declares a package titled Q2, which groups the classes "Student" and "StudentDemoClassEvan" into one folder

public class Student {
    //Creating a class named "Student" which Java will need to use in order to run the program

    /***** Methods *****/

    private int studentNumber;
    //Defines the method "studentNumber" as an integer type data field with a private access modifier
    private String firstName;
    //Defines the method "firstname" as a String type data field with a private access modifier
    private String lastName;
    //Defines the method "lastname" as a String type data field with a private access modifier
    private String emailAddress;
    //Defines the method "emailAddress" as a String type data field with a private access modifier
    private int yearOfBirth;
    //Defines the method "yearOfBirth" as an integer type data field with a private access modifier

    /***** Constructor without parameters *****/

    public Student() {
        //Declares a constructor with no parameters titled "Student"
        studentNumber = 251287806;
        //Assigns my student number to the field "studentNumber"
        firstName = "Evan";
        //Assigns my first name to the field "firstName"
        lastName = "Van";
        //Assigns my last name to the field "lastName"
        emailAddress = "evan@uwo.ca";
        //Assigns my email address to the field "emailAddress"
        yearOfBirth = 2004;
        //Assigns my date of birth to the field "yearOfBirth"
    }

    /***** Constructor with parameters *****/

    public Student(int sn, String fName, String lName) {
        //Declares a constructor with parameters sn, fName, and lName as arguments
        studentNumber = sn;
        //Assigns the value "sn" to the "studentNumber" field
        firstName = fName;
        //Assigns the value "fName" to the "firstName" field
        lastName = lName;
        //Assigns the value "lName" to the "lastName" field
        emailAddress = "";
        //Assigns an empty string to the "emailAddress" field
        yearOfBirth = 0;
        //Assigns the value "0" to the "yearOfBirth" field
    }

    /***** Accessor/Getter methods *****/

    public int getStudentNumber() {
        //Declares an accessor/getter method for the "studentNumber" field
        return studentNumber;
        //Returns my student number
    }

    public String getName() {
        //Declares an accessor/getter method for the "firstName" and "lastName fields
        return firstName+" "+lastName;
        //Returns my full name
    }

    public String getEmailAddress() {
        //Declares an accessor/getter method for the "emailAddress" field
        return emailAddress;
        //Returns my email address
    }

    public int getAge() {
        //Declares an accessor/getter method for the "yearOfBirth" field
        return 2023 - yearOfBirth;
        //Returns my age
    }
}
