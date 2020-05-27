
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) { //chodzi o to, czy w obecnej liscie 'words' znajduje sie 'word'
                System.out.println("You gave the word " + word + " twice");
                break;
            } else { //a jesli sie nie znajduje, to dodaj slowo do listy
                words.add(word);
            }

        }

    }
}
