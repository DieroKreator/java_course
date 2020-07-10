package chapter3;

/* DollarGame
 * Objective: Enter enough change to equal exactly $1
 * Ask user to enter quantities quantities for following coins: pennies, nickels, dimes, and quarters
 * Program should count up the value of all the change
 * If it's exactly $1, they win!
 * If it's more than $1, tell them how much they went over
 * If it's less than $1, tell them by how much they went under
 * Feel free to change the game for your country's currency
 */

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]) {

        double penniesWorth = 1;
        double nickelsWorth = 5;
        double dimesWorth = 10;
        double quartersWorth = 25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        //Ask user to enter quantities
        System.out.println("Enter your number of pennies:");
        int pennies = scanner.nextInt();

        System.out.println("Enter your number of nickels");
        int nickels = scanner.nextInt();

        System.out.println("\"Enter your number of dimes:");
        int dimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int quarters = scanner.nextInt();

        scanner.close();

        //Store the value on a count variable
        double count = pennies * penniesWorth + nickels * nickelsWorth + dimes * dimesWorth + quarters * quartersWorth;

        //Evaluate count result
        if (count > 1){
            double amountOver = count - dollar;
            System.out.println("Sorry, you were over " + String.format("%.2f",amountOver) + " cents");
        }
        else if (count < 1){
            double amountShort = count - dollar;
            System.out.println("Sorry, you were short " + String.format("%.2f",amountShort) + " cents");
        }
        else
            System.out.println("Yay! That's exactly $1.00! You win!");

    }
}
