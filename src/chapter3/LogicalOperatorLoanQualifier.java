package chapter3;

import java.util.Scanner;

/*
 * LOGICAL OPERATORS
 * To qualify for aloan, a person must make at least $30k
 * and ave been working at their current job for at least 2 years.
 */

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployeed = 2;

        //Get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decisions
        if(salary >= requiredSalary && years >= requiredYearsEmployeed){
                System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println("Sorry, you must earn at least $"
                + requiredSalary + " to qualify for the loan");
        }
    }
}
