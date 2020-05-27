import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int numberOfCharacters = this.length;
        
        while (numberOfCharacters > 0){
            int number = this.random.nextInt(characters.length());
            char symbol = characters.charAt(number);
            password = password + symbol;
            numberOfCharacters--; //jest -- bo z kazdym loopem brakuje o jedna mniej litere
        }
        // write code that returns a randomized password
        return password;
    }
}
