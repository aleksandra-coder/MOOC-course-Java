import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        
        int i = 1;
        while (i <= name.length()){
        char charAt = name.charAt(name.length() - i);
        i++;       
            System.out.print(charAt);
        }
    }
}

/*import java.util.Scanner; to jest modelowe rozwiazanie
 
public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        
        int i = name.length() - 1;
        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
        System.out.println("");
    }
}*/
