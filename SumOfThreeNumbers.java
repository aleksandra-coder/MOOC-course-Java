
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type the first number: ");
        int read1 = Integer.parseInt(reader.nextLine());
       
   
        System.out.println("Type the second number: ");
        int read2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the trird number: ");
        int read3 = Integer.parseInt(reader.nextLine());
        
        sum = read1 + read2 + read3;

        System.out.println("Sum: " + sum);
    }
}
