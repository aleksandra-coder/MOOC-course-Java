
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        

        System.out.print("First: ");
        int read1 = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int read2 = Integer.parseInt(reader.nextLine());

        while (read1 <= read2){
            System.out.println(read1);

            read1++;
        
        
        } if (read1 > read2) {
            System.out.println();
        }
    }
}
