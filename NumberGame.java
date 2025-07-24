import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int round = 1;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = rand.nextInt(100) + 1;
            int maxAttempts = 5;
            boolean isGuessed = false;

            System.out.println("\nRound " + round + ":");
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + " - Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number.");
                    totalScore += 10;
                    isGuessed = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!isGuessed) {
                System.out.println("You've used all attempts! The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + totalScore);

            System.out.print("Do you want to play another round? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }

            round++;
        }

        System.out.println("\nGame Over! Your final score: " + totalScore);
        System.out.println("Thanks for playing!");
    }
}
