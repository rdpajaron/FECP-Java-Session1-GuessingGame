package org.example;

import java.util.Scanner;

public class Main {

    static int secretNumber = (int) (Math.random() * 5) + 1;//generates random number from 1-5
    static boolean isGuessCorrect = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 5.");

        //first try
        System.out.print("Guess 1: ");
        int firstGuess = scanner.nextInt();
        guessChecker(firstGuess);
        if(isGuessCorrect) return;
        //second try
        System.out.print("Guess 2: ");
        int secondGuess = scanner.nextInt();
        guessChecker(secondGuess);
        if(isGuessCorrect) return;

        //third try
        System.out.print("Guess 3: ");
        int thirdGuess = scanner.nextInt();
        guessChecker(thirdGuess);
        if(isGuessCorrect) return;

        System.out.println("You lose. The correct number was " + secretNumber + ".");

    }

    private static void guessChecker(int guess){
         isGuessCorrect = guess == secretNumber;
         if(isGuessCorrect){
             System.out.println("You guessed it!");
             System.out.println("You win!");
         }else{
             System.out.println("Wrong guess.");
         }
    }

}