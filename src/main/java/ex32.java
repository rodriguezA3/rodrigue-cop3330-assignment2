package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
import java.util.Scanner;

class App {
    public static void main( String[] args ) {
        int correctAnswer = 0;
        int guessAnswer;
        String playDecision = "Y";

        while(playDecision.equals("Y")) {
            int numGuesses = 0;
            int rightValue = 0;
            int leftValue;
            int midpoint;

            System.out.println("\nEnter the difficulty level (1, 2, or 3): ");
            Scanner gameDifficultyInput = new Scanner(System.in);
            int gameDifficulty = gameDifficultyInput.nextInt();

            if (gameDifficulty == 1) { //if the user selects easy difficulty
                correctAnswer = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
                rightValue = 10;
            }
            else if (gameDifficulty == 2) { //if the user selects medium difficulty
                correctAnswer = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
                        rightValue = 100;
            }
            else if (gameDifficulty == 3) {
                correctAnswer = (int)Math.floor(Math.random() * (1000 - 1 + 1) + 1);
                        rightValue = 1000;
            }

            leftValue = 1;
            midpoint = (rightValue - leftValue) / 2;

            System.out.print("\nI have your number. What is your guess? ");
            Scanner guessAnswerInput = new Scanner(System.in);
            guessAnswer = guessAnswerInput.nextInt();
            numGuesses = numGuesses + 1;

            if (guessAnswer == correctAnswer) {
                System.out.println("You got it in " + numGuesses + " guesses!");
            }
            else { //if they didn't
                while(guessAnswer != correctAnswer) {

                    if(guessAnswer > correctAnswer) {
                        System.out.println("Too high. Guess again: ");


                        if((midpoint < guessAnswer) && (midpoint < correctAnswer)) {
                            rightValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                        else if((midpoint < guessAnswer) && (midpoint > correctAnswer)) {
                            leftValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                    }
                    else {
                        System.out.println("Too low. Guess again: ");


                        if((midpoint > guessAnswer) && (midpoint < correctAnswer)) {
                            leftValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                        else if((midpoint > guessAnswer) && (midpoint > correctAnswer)) {
                            rightValue = midpoint + 1;
                            midpoint = (rightValue - leftValue) / 2;
                        }
                    }

                    numGuesses++;
                    guessAnswerInput = new Scanner(System.in);
                    guessAnswer = guessAnswerInput.nextInt();

                }
            }



            System.out.println("You got it in " + numGuesses + " guesses!\n" + "\n" + "Do you wish to play again (Y/N)?");
            Scanner playDecisionInput = new Scanner(System.in);
            playDecision = playDecisionInput.next();
        }
    }

}
