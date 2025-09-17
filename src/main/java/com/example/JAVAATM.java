package com.example;

public class JAVAATM {
    private double balance;
    private int pin;
    public JAVAATM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }
    public String checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            return String.format("Your balance is ₹%.2f", balance);
        } else {
            return "Invalid PIN. Access denied.";
        }
    }
    public String deposit(double amount, int enteredPin) {
        if (enteredPin == pin) {
            balance += amount;
            return String.format("₹%.2f deposited successfully.", amount);
        } else {
            return "Invalid PIN. Deposit failed.";
        }
    }
    public String withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount <= balance) {
                balance -= amount;
                return String.format("₹%.2f withdrawn successfully.", amount);
            } else {
                return "Insufficient balance.";
            }
        } else {
            return "Invalid PIN. Withdrawal failed.";
        }
    }
}
