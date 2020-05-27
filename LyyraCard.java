/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksandra Postola
 */
public class LyyraCard {

    private double balance;
    private final double economical = 2.5;
    private final double gourmet = 4.0;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;

    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        //balance = balance - 2.50;
        //double balanceAtStart = balance;
        if (this.balance >= economical) {
            this.balance -= economical;
        } //w tym zapisie jesli balance jest za maly, zeby zaplacic, program nie robi nic. Nie trzeba pisac 'else'
        // write code here
    }

    public void payGourmet() {
        //balance = balance - 4.0;
        //double balanceAtStart = balance;
        if (this.balance >= gourmet) {
            this.balance -= gourmet;
        }
        // write code here
    }

    public void loadMoney(double amount) {
        // write code here
         if (amount < 0){
            return;
        }
        
        balance = this.balance + amount;
        if (this.balance + amount > 150.0) {
            this.balance = 150;
        }
        //else if (this.balance + amount < 0) {
         //   this.balance -= amount;
       
        
    }

}
