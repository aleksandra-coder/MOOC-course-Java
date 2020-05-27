
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String text = reader.nextLine();
        System.out.println("Type your password: ");
        String text1 = reader.nextLine();
        
        if ((text.equals("alex") && (text1.equals("mightyducks")))) {
            System.out.println("You are now logged into the system!");
        } else if ((text.equals("emily")) && (text1.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else if (!(text.equals("emily") && !(text1.equals("cat")))) {
            System.out.println("Your username or password was invalid!");
        } else if (!(text.equals("alex") && !(text1.equals("mightyducks")))) {
            System.out.println("Your username or password was invalid!");
        } //the exclamation sign ! is important

    }
}
