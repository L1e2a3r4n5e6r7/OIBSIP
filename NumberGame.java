import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public void Game() {
        int attempts = 0;
        int score;
        int NumberOfAttempts = 10;
        int MIN_RANGE = 1;
        int MAX_RANGE = 100;
        Random random = new Random();
        int sn = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
        
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= NumberOfAttempts; i++) {
            System.out.println("Attempt " + i + " of " + NumberOfAttempts + ": Enter your guessed number:");
            int num = sc.nextInt();
            attempts++;
            if (sn == num) {
                System.out.println("Guessed number is correct!");
                break;
            } else if (sn < num) {
                System.out.println("The generated number is less than " + num);
            } else if (sn > num) {
                System.out.println("The generated number is greater than " + num);
            }
        }

        score = NumberOfAttempts - attempts;
        System.out.println("Your score = " + score);
        System.out.println("You used " + attempts + " attempts.");
    }

    public static void main(String[] args) {
        NumberGame n = new NumberGame();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("You will have 3 rounds to play.");
        
        for (int j = 1; j <= 3; j++) {
            System.out.println("\nRound " + j);
            n.Game();
        }
        System.out.println("Game Over! Thanks for playing.");
    }
}
