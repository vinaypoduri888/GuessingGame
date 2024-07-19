import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 10;
            boolean hasWon = false;

            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (numberOfAttempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("You have " + (maxAttempts - numberOfAttempts) + " attempts left.");
            }

            if (hasWon) {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfAttempts + " attempts.");
            } else {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
