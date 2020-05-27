
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int number = 2;
        int i = 0;

        int sum = 0;

        while (i <= n) {
            sum = (int) (sum + Math.pow(number, i));
            i++;

        }

        System.out.println("The result is " + sum);

    }
}
