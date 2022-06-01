package ch6savingsaccount;

import java.util.Scanner;

public class Ch6SavingsAccount {

    public static void main(String[] args) {
        System.out.println("Ch 6 Account by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Account savingsAccount = new Account();
        int cycles;
        double interestRate;
        double balance;
        System.out.print("Enter starting balance of this Savings Account: ");
        balance = computerKeyboardInput.nextDouble();
        System.out.println("Interest rate: to enter 2.5%, type 2.5");
        System.out.print("Please enter the interest rate for this account: ");
        interestRate = computerKeyboardInput.nextDouble();
        System.out.print("Enter number of cycles to grow this Savings Account: ");
        cycles = computerKeyboardInput.nextInt();
        savingsAccount.setInterestRate(interestRate);
        savingsAccount.setBalance(balance);
        savingsAccount.growAccount(cycles);
        System.out.printf("After %d cycles, the account is worth $%-,10.2f\n", cycles, savingsAccount.getBalance());
    }
}
