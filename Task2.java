import java.util.Random;
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int maxAttempts = 3;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Here are the Rules of the Game\n You will get 3 attempts to Guess right answer to win or you wil lose the Game.");
        System.out.println("Guess a number between 1 and 100.");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the right number!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is smaller than the actual number.");
            } else {
                System.out.println("Your guess is larger than the actual number.");
            }
            
            attempts++;
            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Attempts left: " + remainingAttempts);
            
            if (remainingAttempts == 0) {
                System.out.println("Sorry, you have run out of attempts!");
                System.out.println("The actual number was: " + randomNumber);
            }
        }
        
        scanner.close();
    }
}