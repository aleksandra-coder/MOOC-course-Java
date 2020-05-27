
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Type a password: ");
            String text; //dodac slowo text, zdefiniowac w kolejnej linii text = reader...
            //wczesniej zamiast text pisalam password i nie dzialalo, bo password bylo zdefiniowane juz wyzej
            text = reader.nextLine();
            if (text.equals("carrot")) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
        System.out.println("The secret is: bla bla");

    }

}
