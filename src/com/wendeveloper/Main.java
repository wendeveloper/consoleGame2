package com.wendeveloper;
/*
-while loop that starts the game
-Prompt user to enter (1) to start adding numbers, or (2) to exit the console.
-Generate a random number for the user from 1-50.
-The user has an ongoing integer (we can name a variable called "sum")
  representing a sum of the random number that was generated.
-Before the while loop cycles again, print out a summary of the user's sum.
*/

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // create Scanner object
        System.out.println("Welcome to the game of randomness!");
        System.out.println("enter (1) to start adding numbers, or (2) to exit the console.");
        int sum = 0;
        int minNum = 1;
        int maxNum = 50;
        Random randomNum = new Random();    //instance of Random class
        int randomNumGenerated = 0;

        int playGame = scanner.nextInt();;

        while(playGame == 1) {  //execute the code if this is true
            randomNumGenerated = minNum + randomNum.nextInt(maxNum);
            System.out.println("Your random number: " + randomNumGenerated);
            sum += randomNumGenerated;
            System.out.println("Sum: " + sum);
            // prompt user to enter 1 to start game or 2 to exit
            System.out.println("enter 1 to continue, or 2 to end game.");
            playGame = scanner.nextInt();
        }
        System.out.println("Your total sum of random numbers is: " + sum);
        System.out.println("Bye-bye");
    }
}
