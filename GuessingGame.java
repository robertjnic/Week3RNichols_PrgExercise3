/** Program: Guessing Game Program
* File: GuessingGame.java
* Summary: Prompts user to guess a random number.
* Author: Robert J. Nichols
* Date: October 19, 2017 
**/

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        //Generate a random number.
        int number = (int)(Math.random() * 10001);
        
        //Initialize variables
        int guess = 0;
        int count = 1;
        int min = 1;
        int max = 10000;
        
        //Initialize Scanner
        Scanner input = new Scanner(System.in);
               
        //While loop runs while the guess is incorrect
        while (guess != number){
            
            //Prompt user for their guess
            System.out.print("Enter a guess between " + min + " and " + max + ": ");
            guess = input.nextInt();

            //if the guess is the same as the number
            if(guess == number)
                System.out.println("YOU WIN. It took you " + count + " guesses.");

            //if guess is higher than the number
            else if (guess > number){
                System.out.println("LOWER.");
                max = guess - 1;
                count++;
            }

            //if guess is lower than the number
            else{
                System.out.println("HIGHER.");
                min = guess + 1;
                count++;
            }
        }
    }
}
