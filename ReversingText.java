
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        String reverseOrder = "";//to jest moj koszyk w ktorym zbieram kolejno litery ze slowa, na razie jest pusty
        int i = text.length() - 1;
        while (i >= 0) {
            reverseOrder = reverseOrder + text.charAt(i); //tu jest ten koszyk plus litera
            
            //System.out.print(text.charAt(i));
            i--;
        }
        return reverseOrder;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
