/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bschw8submission;


import java.util.Random;
import java.util.Scanner;

/**
 * pick an integer less than 100 don't show this number to the user give the
 * user 10 guesses store the guesses in the array check the guesses and output
 * message don't give an extra change if get the guess wasted output win if the
 * user does output message if the user don't get the answer after guesses
 *
 * @author lucas
 */
public class BScHW8Submission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKb = new Scanner(System.in); //get the input from the user

        int number;

        Random r = new Random(); //Creating a Random

        number = r.nextInt(100);  //Generating a rondomly value until 100. It's possible to ask the user instead!

        int num = number;
        //System.out.println("The number generated rondomly is: " + num); //JUST TO SEE THE NUMBER FOR NOW

        //user information
        System.out.println("\nINFORMATION: Some number between 0 to 100 has been randomly generated and you will have 10 chances to get the correct number\n");

        int[] guess = new int[10]; //this creates the array in memory

        for (int i = 0; i < guess.length; i++) { //Loop to read the guesses from the user

            System.out.println("Chance " + (i + 1) + ":");
            guess[i] = myKb.nextInt();


            if (i != 0) { //different than 0 because bofere i=0 there is no guesses to check

                for (int j = 0; j <= i; j++) { //Loop to comparate (i and j) and check similarities 

                    if (guess[j] == guess[i] && i !=j) { //check numbers to ckeck if there is any number guessed

                        System.out.println("You missed a chance number " + (i + 1) + "   --> The guess has already benn guessed! <--\n");

                    }

                }

            }

            if (guess[i] == num) { //condition if the user has got the correct number and finish the program if the user do it

                System.out.println("You win!");
                break;

            } else if (guess[i] > 100 || guess[i] < 0) { //setting the guess to 0 to 100

                System.out.println("You missed a chance number " + (i + 1) + "   --> The guess needs to be between 0 to 100! <--\n");

            } else if (i == guess.length - 1) { //output the message if the user don't get the correct number after guesses

                System.out.println("\nHard Luck! \nUnfurtunately you didn't get the correct number, try again later! \n ");
            }

        }

    }
}

