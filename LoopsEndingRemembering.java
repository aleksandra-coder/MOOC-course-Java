
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int i = 0;

        System.out.println("Type numbers: ");

        double average = 0.0;
               
        int iEven = 0;
        int iOdd = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                iEven++;
            } else {
                iOdd++;
            }
            sum = sum + number;
            i++;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + i);
        if (i > 0) {
            average = (1.0 * sum) / i;
            System.out.println("Average: " + average);
        } else {
            System.out.println("Average: " + average);
        }
        System.out.println("Even numbers: " + iEven);
        System.out.println("Odd numbers: " + iOdd);
    }
}
