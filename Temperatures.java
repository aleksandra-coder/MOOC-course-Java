
import java.util.Scanner;

public class Temperatures {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        while (true) {
            System.out.println("Type a floating point number: ");
            double value = Double.parseDouble(reader.nextLine());
            
            if (value < -30 || value > 40) {
                System.out.println("Temperature not valid");
                //you don't need to put 'break' here
                //with 'break' the program stops putting numbers to the graph
                
            } else {                
                Graph.addNumber(value);
            }            
            
        }

        // Graph is used as follows:
        /*Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);*/
        // Remove or comment out these lines above before trying to run the tests.
    }
}
