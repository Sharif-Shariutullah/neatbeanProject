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
public class BankAccountExample {

    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(200);

        // Deposit and withdraw operations
        savingsAccount.deposit(50);
        savingsAccount.withdraw(30);
        savingsAccount.withdraw(150); // This withdrawal will be denied

        // Display the final balance
        System.out.println("Final Balance: $" + savingsAccount.balance);
    }
}
