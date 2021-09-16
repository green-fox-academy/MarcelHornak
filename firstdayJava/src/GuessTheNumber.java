import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(11);
        if (num == 0){
            num ++;
        }
        System.out.println("Guess a number from 1 to 10: ");
        int guess = scanner.nextInt();
        while (guess != num){
            if (guess > num){
                System.out.println("You guessed too high! Guess again: ");
            }
            else {
                System.out.println("You guessed too low! Guess again: ");
            }
            guess = scanner.nextInt();
        }
        System.out.println("You guessed correctly!");
    }
}
