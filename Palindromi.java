
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
       
        String reverseOrder = ""; //najpierw jest pusty
        int i = text.length() - 1; //zaczynamy od dlugosci slowa minus 1, dzieki temu liczymy od konca slowa
        while (i >= 0) {
            reverseOrder = reverseOrder + text.charAt(i);
            i--; //za kazdym loopem zmniejszamy ilosc powtorzen o 1, az do zera
        }
        if (text.equals(reverseOrder)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
