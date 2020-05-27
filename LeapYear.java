
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        if (year% 400 == 0) { /*jesli rok dzieli sie przez 400 bez reszty, 
            to rowna sie 0, uzywam modulo %*/
            System.out.println("The year is a leap year.");
        } else if (year%100 ==0) {
            System.out.println("The year is not a leap year.");
        } else if (year% 4 == 0) {
            System.out.println("The year is a leap year");
        }else {
            System.out.println("The year is not a leap year");
        }

    }
}
