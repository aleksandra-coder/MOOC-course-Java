
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String name = reader.nextLine();  
        System.out.println("Type your age: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String name1 = reader.nextLine();
        System.out.println("Type your age: ");
        int number1 = Integer.parseInt(reader.nextLine());
        int sum = number + number1;
        System.out.println(name + " and " + name1 + " are " + sum + " years old in total");
        
        
         
    }
}
