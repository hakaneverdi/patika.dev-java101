import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);
        int selected;
        int[] wrongGuess = new int [5];
        boolean isWin = false;

        for (int right = 0; right < 5; right++) {
            System.out.print("Enter your guess number (0-100): ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Must be between 0 and 100");
                continue;
            }
            if (selected == number) {
                isWin = true;
                System.out.println("Congratulations! Your guess is correct! " + "The secret number is: " + number);
                break;
            }
            else {
                System.out.println("Incorrect number");
                if (selected > number) {
                    System.out.println("Your guess is bigger than the secret number");
                }
                else {
                    System.out.println("Your guess is smaller than the secret number");
                }
                wrongGuess[right] = selected;
                System.out.println("Remainder right: " + (4 - right));
            }
        }
        if (!isWin) {
            System.out.println("You lost!" + " Your guesses are : " + Arrays.toString(wrongGuess));
            System.out.println("The secret number was : " + number);
        }
    }
}