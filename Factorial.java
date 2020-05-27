
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.next());

        int fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;

        }

        System.out.println("Factorial is " + fact);
        {

        }
        if (n > 20) {

            System.out.println("The result is out of range");
            
        }

    }
}


