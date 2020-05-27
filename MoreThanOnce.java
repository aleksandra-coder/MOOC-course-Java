
import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {

        // write your code here
        int i = 0; //oznacza, ile razy pojawia sie numer na liscie
        for (int number : list) {
            if (searched == number) {
                i++; //ten zapis oznacza, ze jesli searched rowna sie number, szukamy dalej, bo musimy znalezc dwa razy ten sam
            }
        }
        if (i > 1) { //jesli pojawia sie wiecej niz raz
            return true;
        }
        return false;
    }
    /* int howMany = 0;
        for (int numberInList : list) {
            if (numberInList == searched) {
                howMany = howMany + 1;
            }
 
            if (howMany > 1) {
                return true;
            }
        }
        return false;
    } */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
