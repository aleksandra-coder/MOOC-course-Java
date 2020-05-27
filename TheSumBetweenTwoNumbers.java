
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int read1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int read2 = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = read1;
                
        while (i <= read2){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum); 
    }
}
