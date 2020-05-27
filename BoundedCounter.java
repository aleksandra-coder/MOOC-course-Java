/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksandra Postola
 */
public class BoundedCounter {

    private int value;
    private final int upperLimit;
    //private int minutes;
    //private int hours;
    

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here

        if (this.value >= upperLimit) {
            this.value = 0;

        } else {
            value++;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + value;
        }
        return "" + value;
        // write code here
    }

    public int getValue() {        
        return this.value;
        // write here code that returns the value
    }
    public void setValue(int newValue){
        if(newValue < 0 || newValue > upperLimit){
            return;
        }
        this.value = newValue;
    }
}
