
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;
    

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
// initialize here the object variable amountOfNumbers
    }


    public void addNumber(int number) {
        this.amountOfNumbers++; //tu moze byc ++, bo dodajemy po 1 wiecej
        this.sum = this.sum + number; //tu musi byc +number, bo dodajemy kolejne liczby do siebie
        //zeby liczba rosla, trzeba dodac ++
        // code here
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
     public int sum() {        
        // code here        
        return this.sum;
    }

    public double average() {
        // code here
        if(this.amountOfNumbers == 0){
            return 0;
        }
        double average = 1.0*this.sum / this.amountOfNumbers;
        return average;
    }
}
