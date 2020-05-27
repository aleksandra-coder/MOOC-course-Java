
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        int divident = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int divisor = Integer.parseInt(reader.nextLine());
        System.out.println("Division: ");
        double quotient = 1.0 * divident / divisor;
        
        // in the println only put divident and divisor but no other additional text describing what it is.
        
        System.out.println(divident + " / " + divisor + " = " + quotient);
                
        
       
    }
}
