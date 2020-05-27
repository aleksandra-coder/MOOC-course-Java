
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        while (true) {
            System.out.println("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
            guess++;

            if (numberDrawn == number) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            if (numberDrawn < number) {
                System.out.println("The number is lesser, guesses made:" + guess);
            } else if (numberDrawn > number) {
                System.out.println("The number is greater, guesses made: " + guess);
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
