/*
Course: CS112               October 9, 2018
Chapter Number: 11         Homework:Chapter 11 project 2
Programmer: Mario Rodriguez
Date Created: October 8, 2018
------------------------------------------------
Program Title: Chapter 11 project 2
Description: This Program is meant to take in a text file that has a list of numbers
and make a list of those numbers without any duplicates.

ALGORITHM:
-Let the user know what the program does and prompt them to enter a number
-Do some recursive magic and spit that result back to the user
- End program
 */


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //variables to hold the values of the input and the result plus
        //the Scanner for user input ↓ ↓ ↓ ↓ ↓ ↓
        Scanner keyboard = new Scanner(System.in);
        int input, result;
        //Prompt the user what the program does and what to input
        System.out.println("------------------------------------------------------------------" +
                         "\nWelcome to my program that tells you how many hand shakes occurred" +
                         "\nInput the number of people in a room and I'll tell you the number" +
                         "\nof handshakes that occurred in that room!");
        input = keyboard.nextInt();
        //Do some computing magic
        result = numberOfShakes(input);
        //Let 'em know how many handshakes there were
        System.out.println("Your Result is: " + result + " Handshakes!");

    }

    public static int numberOfShakes(int num) {
        /*
        I was really tempted to just use

        n(n-1)
        ------
           2
         */
        if (num == 2){
            //Stopping case
            return (1);
        } else if (num == 0 || num == 1) {
            return 0; //if there are 1 or 0 people in the room there will be no handshakes
        } else {
            return (num - 1) + numberOfShakes(num-1) ;
        }
    }
}
