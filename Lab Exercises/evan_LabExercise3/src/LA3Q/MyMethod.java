/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 6, 2023
 Description: This is question 1 of Lab Assignment 3 and the task of this question is to prompt the user to select a mathematical function and display an example with that function using conditional and loop statements.
 ******************************/

package LA3Q;
//Declares a package titled LabQ3, which groups the classes "MyMethod" and "DemoMyMethodsEvan" into one folder

public class MyMethod {
    //Creating a class named "MyMethod" which Java will need to use in order to run the program

    /***** Method *****/

    public static final double PI = 3.141592653589793;
    //Declares a field named "PI" and assigns it to the value "3.141592653589793"

    /***** Power/Exponent Expression *****/

    public static double myPow(double x, int y) {
        //Declares a public static double method titled myPow() with arguments "double x" and "int y"
        if (x == 0) {
            return 0;
            //Declares an "if" loop that states if "x" equals 0, the power expression will return a 0
            //This is because any exponent value with a base of 0 returns a 0
        }
        if (y == 0) {
            return 1;
            //Declares an "if" loop that states if "y" equals 0, the power expression will return a 1
            //This is because any number to the power of 0 returns a 1
        }
        if (y < 0) {
            return 1 / myPow(x, -y);
            //Declares an "if" loop that states if "y" is less than 0, the power expression will return "1 / x^-y" where "y" is a negative value
            //The mathematical expression stated above is equivalent to "x^-y" where "y" is a positive value in this case
            //Example: 1 / 2^-(-2) = 2^-2
        }
        double result = 1;
        //Declares a variable titled "result"; it has an initial value of 1
        while (y > 0) {
            //Declares a "while" loop stating that when "y > 0," the program will return the expression "x^y"
            result *= x;
            //Same as "result = result * x"
            y--;
            //Post-decrements the "y" value
        }
        return result;
        //Returns the value of the result
    }

    /***** Factorial Expression *****/

    public static double myFactorial(int n) {
        //Declares a public static double method titled myFactorial() with argument "int n"

        double result = 1;
        //Stores the factorial result in the variable "result"; it has an initial value of one

        for (int i = 2; i <= n; i++) {
            //Declares a "for" loop for the variable "i = 2", the condition that "i" has to be less than or equal to "n," and "i" increasing by +1 using the post-increment "i++"
            result *= i;
            //Same as "result = result * i"
        }
        return result;
        //Returns the result of the expression
    }

    /***** Sine Expression *****/

    public static double mySin(double x) {
        //Declares a public static double method titled mySin() with argument "double x"
        int N = 20;
        //Declares an integer variable titled "N"; it has a value of 20
        double result = 0;
        //Stores the sine result in the variable "result"; it has an initial value of 0
        for (int n = 0; n <= N; n++) {
            //Declares a "for" loop for the variable "n = 0", the condition that "n" has to be less than or equal to "N," and "n" increasing by +1 using the post-increment "n++"
            double numerator = myPow(-1, n) * myPow(x, 2 * n + 1);
            //Declares a variable titled "numerator" which calls the method myPow() to multiply the values in the numerator together
            double denominator = myFactorial(2 * n + 1);
            //Declares a variable titled "denominator" which calls the method myFactorial() to calculate the value in the denominator
            result += numerator / denominator;
            //Calculates the final result of the expression
        }
        return result;
        //Returns the result of the expression
    }

    /***** Cosine Expression *****/

    public static double myCos(double x) {
        //Declares a public static double method titled myCos() with argument "double x"
        int N = 20;
        //Declares an integer variable titled "N"; it has an initial value of 20
        double result = 0;
        //Stores the cosine result in the variable "result"; it has an initial value of 0

        for (int n = 0; n < N; n++) {
            //Declares a "for" loop for the variable "n = 0", the condition that "n" has to be less than or equal to "N," and "n" increasing by +1 using the post-increment "n++"
            double p1=1;
            //p1 is initialized to 1 since it will be used for series multiplication
            for(int i = 1; i <= n; i++) {
                //Declares a "for" loop for the variable "i = 1", the condition that "i" has to be less than or equal to "n," and "i" increasing by +1 using the post-increment "i++"
                p1 *= -1;
                //Same as "p1 = p1 * -1"
            }
            double p2 = 1;
            //p2 is initialized to 1 since it will be used for series multiplication
            for(int j = 1; j <= 2 * n; j++) {
                //Declares a "for" loop for the variable "j = 1", the condition that "j" has to be less than or equal to "2 * n," and "j" increasing by +1 using the post-increment "j++"
                p2 *= j;
                //Same as "p2 = p2 * j"
            }
            double p3 = 1;
            //p3 is initialized to 1 since it will be used for series multiplication
            for(int k = 1; k <= 2 * n; k++) {
                //Declares a "for" loop for the variable "k = 1", the condition that "k" has to be less than or equal to "2 * n," and "k" increasing by +1 using the post-increment "k++"
                p3 *= x;
                //Same as "p3 = p3 * x"
            }
            result = result + (p1 / p2) * p3;
            //Calculates the final result given the equation for calculating the cosine of a value
        }
        return result;
        //Returns the result of the expression
    }

    /***** Degrees to Radians Expression *****/

    public static double myDegreeToRadian(double degree) {
        //Declares a public static double method titled myDegreeToRadian() with argument "double degree"
        return degree * PI / 180;
        //Returns the value in radians using the formula above
    }

    /***** Uppercase to Lowercase Expression *****/

    public static char myToLowerCase(char c) {
        //Declares a public static char method titled myToLowerCase() with argument "char c"
        if (c >= 'A' && c <= 'Z') {
            //Declares an "if" loop that determines whether "c" is an uppercase letter by the arguments "c >= 'A' && c <= 'Z'"
            return (char) (c + ('a' - 'A'));
            //If "c" is uppercase, it gets added by the difference between "a" and "A" to convert it to lowercase
        }
        else {
            return c;
            //Else, if none of the above are true ("c" is already in lowercase), the original value of "c" is returned
        }
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

    /***** Footer method *****/

    public static void myFooter(int questionNum) {
        //Defines a method called myFooter, containing the variable "questionNum" as an integer
        System.out.println("\n*** Signing off from Question " + questionNum + " – Evan ***");
        //Prints a concluding statement with the variable "questionNum"
    }
}