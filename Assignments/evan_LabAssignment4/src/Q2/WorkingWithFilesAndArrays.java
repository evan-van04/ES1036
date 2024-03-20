/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 27, 2023
 Description: This is question 2 of Lab Assignment 4 and the task of this question is to draw values from a .txt file and determine the highest, lowest, average, and standard deviation of those set of values.
 ******************************/

package Q2;
//Declares a package titled "Q2", which groups the classes "WeeklySaleDataEvan" and "WorkingWithFilesAndArrays" into one folder

import LA3Q.*;
//Imports the methods used in package "LA3Q"

import java.io.*;
//Imports the pre-existing classes into the program from the java.io package

import java.util.Scanner;
//Imports the pre-existing "Scanner" class into the program from the java.util package

public class WorkingWithFilesAndArrays {
    //Declares a class named "WorkingWithFilesAndArrays" which Java will need to use in order to run the program

    /***** DRIVER METHOD *****/

    public static void main(String[] args) throws IOException {
        //Declares a method titled "main()" which is used as an entry point in Java and all Java programs require a main method
        //The "throws" keyword is used to indicate the type of exceptions a method may throw
            //An exception is an event that represents a run-time error that prevents the program from running normally
        //In this example, the "main()" method includes a "PrintWriter" object which may throw a checked IOException, thus, it has to be declared in the method header

        /***** HEADER METHOD *****/

        MyMethod.myHeader(4, 2, "The task of this question is to draw values from a .txt file and determine the highest, lowest, average, and standard deviation of those set of values.");
        //Calls the method "myHeader()" method from the "MyMethod" class and defines the parameters "labNum", "questionNum", and "description" with the appropriate values

        double[] sale = new double[7];
        //Declares a double-type array reference variable titled "sale" which has a length of 7

        File myFile = new File("Datafile_LabAssignment4.txt");
        //Opens the file named "Datafile_LabAssignment4.txt" by creating a File-type reference variable titled "myFile"

        Scanner inputFile = new Scanner(myFile);
        //Creates a Scanner-type reference variable and instantiates it with the variable "myFile"
        //This is declared in order for the program to read the .txt file

        while(inputFile.hasNext()) {
            //Declares a "while" loop that continues to run if the next item in the file is available to be read

            for(int i = 0; i < sale.length; i++) {
                //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

                sale[i] = inputFile.nextDouble();
                //Assigns the value that the program has read from the Datafile_LabAssignment4.txt file and assigns it to "sale[i]"

            }

        }

        WeeklySaleDataEvan w = new WeeklySaleDataEvan(sale);
        //Creates a "WeeklySaleDataEvan" type reference variable and instantiates it with the variable "sale"

        System.out.println("Reading the file...");
        //Prints the above text as a literal

        System.out.println("Here is this week's sale-data...");
        //Prints the above text as a literal

        w.displaySaleData();
        //With the help of the "WeeklySaleDataEvan" type reference variable, the program calls the "displaySaleData()" method
        //This prints the 7 values from the Datafile_LabAssignment4.txt file

        System.out.printf("\nHighest weekly Sale: %.2f", w.getHighestSale());
        //Using the "printf()" method, the program calls the "getHighestSale()" method and displays the highest weekly sale

        System.out.printf("\nLowest weekly Sale: %.2f", w.getLowestSale());
        //Using the "printf()" method, the program calls the "getLowestSale()" method and displays the lowest weekly sale

        System.out.printf("\nAverage weekly Sale: %.2f", w.getAverageSale());
        //Using the "printf()" method, the program calls the "getAverageSale()" method and displays the average weekly sale

        System.out.printf("\nStandard Deviation of Weekly Sale: %.2f", w.getStandardDeviation());
        //Using the "printf()" method, the program calls the "getStandardDeviation()" method and displays the standard deviation of the weekly sale

        System.out.println("\n.. Updating the file with the above info...");
        //Prints the above text as a literal

        System.out.println("Closed the file.....");
        //Prints the above text as a literal

        /***** FOOTER METHOD *****/

        MyMethod.myFooter(2);
        //Calls the "myFooter()" method from the "MyMethod" class

        FileWriter fw = new FileWriter("Datafile_LabAssignment4.txt", true);
        //Creates a "FileWriter" reference variable and instantiates it with the file name that will be used
        //This is declared so that the program can append the Datafile_LabAssignment4.txt with the new data (i.e. highest, lowest, average, and standard deviation)

        PrintWriter appendFile = new PrintWriter(fw);
        //Creates a "PrintWriter" reference variable and instantiates it with the "FileWriter" reference variable created above "fw"
        //Used to open or create a file and to write, save, or output any textual data to that file

        appendFile.printf("\n\nHighest weekly Sale: %.2f", w.getHighestSale());
        //Using the "printf()" method, the program calls the "getHighestSale()" method and displays the highest weekly sale to the Datafile_LabAssignment4.txt file

        appendFile.printf("\nLowest weekly Sale: %.2f", w.getLowestSale());
        //Using the "printf()" method, the program calls the "getLowestSale()" method and displays the lowest weekly sale to the Datafile_LabAssignment4.txt file

        appendFile.printf("\nAverage weekly Sale: %.2f", w.getAverageSale());
        //Using the "printf()" method, the program calls the "getAverageSale()" method and displays the average of the weekly sales to the Datafile_LabAssignment4.txt file

        appendFile.printf("\nStandard Deviation of Weekly Sale: %.2f", w.getStandardDeviation());
        //Using the "printf()" method, the program calls the "getStandardDeviation()" method and displays the standard deviation of the weekly sales to the Datafile_LabAssignment4.txt file

        appendFile.println("\n\nReported by: Evan Van");
        //Prints the above text to the Datafile_LabAssignment4.txt file

        appendFile.close();
        //Closes the Datafile_LabAssignment4.txt file

    }
}