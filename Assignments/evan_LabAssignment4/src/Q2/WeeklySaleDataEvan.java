/******************************
 Full Name: Evan Van
 Student Number: 251287806
 Date: March 27, 2023
 Description: This is question 2 of Lab Assignment 4 and the task of this question is to draw values from a .txt file and determine the highest, lowest, average, and standard deviation of those set of values.
 ******************************/

package Q2;
//Declares a package titled "Q2", which groups the classes "WeeklySaleDataEvan" and "WorkingWithFilesAndArrays" into one folder

public class WeeklySaleDataEvan {
    //Declares a class named "WeeklySaleDataEvan" which Java will need to use in order to run the program

    private double[] sale;
    //Declares a private double-type array field titled "sale"

    /***** CONSTRUCTOR WITHOUT A PARAMETER *****/

    public WeeklySaleDataEvan() {
        //Declares a constructor without arguments titled "WeeklySaleDataEvan()"

        this.sale = null;
        //Assigns the value of null to the double-type array reference variable "sale"
        //The "this" keyword is used to refer the object "sale" from inside its class

    }

    /***** CONSTRUCTOR WITH A PARAMETER *****/

    public WeeklySaleDataEvan(double[] sale) {
        //Declares a constructor titled "WeeklySaleDataEvan()" with an argument declaring "sale" as a double-type array reference variable

        this.sale = sale;
        //Assigns the value of "sale" to "this.sale"
        //The "this" keyword is used to differentiate the "sale" variable from each other as both have the same name

    }

    /***** AVERAGE SALE METHOD *****/

    public double getAverageSale() {
        //Declares a public double-type method titled "getAverageSale()"
        //This method will return the average of the 7 elements from the Datafile_LabAssignment4.txt file

        double sum = 0;
        //Declares a double-type variable titled "sum" which has been assigned the value of 0

        double average;
        //Declares a double-type variable titled "average"

        for(int i = 0; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            sum += sale[i];
            //Sums each element of the array "sale" together using the double-type variable "sum"

        }

        average = sum / sale.length;
        //Calculates the average of the 7 elements by dividing their sum by the length of the array "sale" (7) and assigning this value to the double-type variable "average"

        return average;
        //Returns the average of the 7 elements from the Datafile_LabAssignment4.txt file

    }

    /***** HIGHEST SALE METHOD *****/

    public double getHighestSale() {
        //Declares a public double-type method titled "getHighestSale()"
        //This method will return the largest value of the 7 elements from the Datafile_LabAssignment4.txt file

        double highest = sale[0];
        //Assigns the first position of the array "sale" to the double-type variable "highest"

        for(int i = 0; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            if (sale[i] > highest) {
                //Declares an "if" statement with the condition that if "sale[i]" is greater than "highest", "highest" will be assigned the value of "sale[i]"

                highest = sale[i];
                //Assigns the current value of "sale[i]" to the variable "highest"

            }

        }

        return highest;
        //Returns the largest value of the 7 elements from the Datafile_LabAssignment4.txt file

    }

    /***** LOWEST SALE METHOD *****/

    public double getLowestSale() {
        //Declares a public double-type method titled "getLowestSale()"
        //This method will return the smallest value of the 7 elements from the Datafile_LabAssignment4.txt file

        double lowest = sale[0];
        //Assigns the first position of the array "sale" to the double-type variable "lowest"

        for (int i = 1; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            if (sale[i] < lowest) {
                //Declares an "if" statement with the condition that if "sale[i]" is less than "lowest", "lowest" will be assigned the value of "sale[i]"

                lowest = sale[i];
                //Assigns the current value of "sale[i]" to the variable "lowest"

            }

        }

        return lowest;
        //Returns the smallest value of the 7 elements from the Datafile_LabAssignment4.txt file

    }

    /***** DISPLAY SALES METHOD *****/

    public void displaySaleData() {
        //Declares a public void method titled "displaySaleData()"
        //This method displays all 7 values from the Datafile_LabAssignment4.txt file

        System.out.print("[");
        //Prints the above text as a literal

        for(int i = 0; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            System.out.print(sale[i] + ", ");
            //Displays the 7 values from the Datafile_LabAssignment4.txt file separated by a comma and white space

        }

        System.out.print("\b\b]");
        //Deletes the white space and comma from the last displayed value

    }

    /***** STANDARD DEVIATION OF SALES METHOD *****/

    public double getStandardDeviation() {
        //Declares a public double-type method titled "getStandardDeviation()"
        //This method will return the standard deviation of the 7 elements from the Datafile_LabAssignment4.txt file

        double sum = 0;
        //Declares a double-type variable titled "sum" which has been assigned a value of 0

        double standardDeviation = 0;
        //Declares a double-type variable titled "standardDeviation" which has been assigned a value of 0

        double average;
        //Declares a double-type variable titled "average"

        for(int i = 0; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            sum += sale[i];
            //Sums all the values from the Datafile_LabAssignment4.txt file together

        }

        average = sum / sale.length;
        //Assigns the quotient of the sum of all 7 values divided by the length of the array "sale" (7) to the variable "average"

        for(int i = 0; i < sale.length; i++) {
            //Declares a "for" loop for the variable "i" which is equal to 0, the condition that "i" is less than the length of the array "sale", and that "i" is increasing by 1 using the post-increment "i++"

            standardDeviation += Math.pow((sale[i] - average), 2);
            //Performs (value 1 - average)^2 + (value 2 - average)^2... for all 7 values and assigns this value to the variable "standardDeviation"

        }

        standardDeviation = Math.sqrt(standardDeviation / 7);
        //Calculates the square root of "standardDeviation" divided by 7 and re-assigns this value to the variable "standardDeviation"

        return standardDeviation;
        //Returns the standard deviation of the 7 values from the Datafile_LabAssignment4.txt file

    }

}
