import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
       
        while (this.numbers.size() < 7) { //okreslamy ile razy bedziemy losowac numery
            int newNumber = random.nextInt(39) + 1; //wprowadzamy variable newNumber, czyli numer ktory bedziemy losowac z 39
            boolean numberDrawn = this.containsNumber(newNumber);
            
            if (!numberDrawn) {
                this.numbers.add(newNumber);// dodajemy numer tylko jesli nie jest juz wylosowany

            } 
        }
    }
                    // Write the number drawing here using the method containsNumber()
    
    public boolean containsNumber(int number) {
        for (int drawNumber : this.numbers) {
            if (drawNumber == number) {
                return true;
            }
        }
        return false;
                        // Test here if the number is already in the drawn numbers        
    }
}
