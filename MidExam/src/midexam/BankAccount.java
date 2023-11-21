/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author B-5
 */
public class BankAccount {

    protected double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: $" + amount);
        System.out.println("Current Balance: $" + balance);
        
        
       
    }

    
    
    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal denied.");
        }
    }
}
