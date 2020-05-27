
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: ");
        int result = number + number1;
        System.out.println("Type a number: " + number + " Type another number: " + number1 + " Sum of the numbers: " + result);
        
        
        
        
    }
}
