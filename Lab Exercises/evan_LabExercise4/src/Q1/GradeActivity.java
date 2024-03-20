/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: Apr 1, 2023
 Description: This is question 1 of Lab Exercise 4 and the task of this question is to calculate the course-grade of a student using concepts of inheritance and polymorphism.
 ******************************/

package Q1;
//Declares a package titled "Q1", which groups the classes "Name", "InstructorInfo", "CourseAndInstructor", "StudentInfo", and "GradeActivity" into one folder

/***** CLASS *****/

public class GradeActivity {
    //Declares a class named "GradeActivity" which Java will need to use in order to run the program

    /***** FIELDS *****/

    private double[] grade;
    //Declares a private double-type array reference variable field titled "grade"

    private double score;
    //Declares a private double-type field titled "score"

    private int outOf;
    //Declares a private int-type field titled "outOf"

    private double percentScore;
    //Declares a private double-type field titled "percentScore"

    /***** CONSTRUCTOR WITHOUT ARGUMENTS *****/

    public GradeActivity() {}
    //Declares a constructor without arguments titled "GradeActivity()"

    /***** CONSTRUCTOR WITH ARGUMENTS *****/

    public GradeActivity(double score, int outOf) {
        //Declares a constructor titled "GradeActivity()" with arguments "score" as a double-type variable and "outOf" as an int-type variable

        this.outOf = outOf;
        //Assigns the value of "outOf" to the field "outOf" using the "this" keyword
        //The "this" keyword is used to differentiate the "outOf" variable from each other as both have the same name

        this.score = score;
        //Assigns the value of "score" to the field "score" using the "this" keyword
        //The "this" keyword is used to differentiate the "score" variable from each other as both have the same name

    }

    /***** GRADE ACTIVITY METHOD *****/

    public GradeActivity(double[] grade, int outOf) {
        //Declares a constructor titled "GradeActivity()" with arguments "grade" as a double-type array reference variable and "outOf" as an int-type variable

        this.outOf = outOf;
        //Assigns the value of variable "outOf" to field "outOf" using the "this" keyword

        this.grade = grade;
        //Assigns the value of variable "grade" to field "grade" using the "this" keyword

        double sum = 0;
        //Declares a double-type variable titled "sum" which has been assigned the value 0

        for(int i = 0; i < grade.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "grade", and that "i" is increasing by 1 using the post-increment "i++"

            sum += grade[i];
            //Sums all the values of the "grade" array reference variable together and assigns this value to the variable "sum"

        }

        if (outOf == 100)
            //Declares an "if" statement that runs if variable "outOf" is equal to 100

            score = sum;
            //Assigns the variable "sum" to the field "score"

        else
        //If the above "if" statement is false, then this section of the "if" statement will run

            score = sum / grade.length;
            //Divides the sum of the elements of the array "grade" by the array's length and assigns this value to the variable "score"
            //This essentially calculates the average of the elements of the array "grade"

    }

    /***** GET SCORE METHOD *****/

    public double getScore() {
        //Declares a public double-type method titled "getScore()"

        return score;
        //Returns the value of the field "score"

    }

    /***** GET LETTER GRADE METHOD *****/

    public String getLetterGrade() {
        //Declares a public String-type method titled "getLetterGrade()"

        percentScore = score / outOf * 100;
        //Calculates the field "score" divided by "outOf" times 100 and assigns this value to the field "percentScore"

        if (Math.round(percentScore) > 90) return "A+";
        //Declares an "if" statement that returns the literal "A+" if the rounded score of the field "percentScore" is greater than 90

        else if (Math.round(percentScore) >= 80) return "A";
        //If the above "if" statement is false, then this "else if" statement returns the literal "A" if the rounded score of the field "percentScore" is greater than or equal to 80

        else if (Math.round(percentScore) >= 70) return "B";
        //If the above "if" statement is false, then this "else if" statement returns the literal "B" if the rounded score of the field "percentScore" is greater than or equal to 70

        else if (Math.round(percentScore) >= 60) return "C";
        //If the above "if" statement is false, then this "else if" statement returns the literal "C" if the rounded score of the field "percentScore" is greater than or equal to 60

        else if (Math.round(percentScore) >= 50) return "D";
        //If the above "if" statement is false, then this "else if" statement returns the literal "D" if the rounded score of the field "percentScore" is greater than or equal to 50

        else return "F";
        //If the above "if" statement is false, then this "else" statement returns the literal "F" if the rounded score of the field "percentScore" is less than 49

    }

    /***** DISPLAYS THE SCORE, LETTER GRADE, AND PERCENT SCORE *****/

    @Override
    //The "@Override" annotation is used to indicate that the below method is intended to override a similar method in its superclass

    public String toString() {
        //Declares a public String-type method titled "toString()"

        return String.format("%.2f (out of %d), Letter Grade: %s [%d%%]", score, outOf, getLetterGrade(), Math.round(percentScore));
        //Using the "String.format()" method, the program prints the student's grade, what it's out of, the scores respective letter grade, and the grade's percent score

    }

}