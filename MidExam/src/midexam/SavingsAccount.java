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
public class SavingsAccount extends BankAccount {
    // Constructor

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to prevent withdrawals if balance falls below 100
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
        }
    }
}
