/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication47;

/**
 *
 * @author QUINONES_CPE113
 */
class CampusWalletTransfer3 {

    private String owner;
    private int balance;

    public CampusWalletTransfer3(String owner, int balance) {
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public CampusWalletTransfer3(String owner) {
        this(owner, 0);
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean transferTo(CampusWalletTransfer3 recipient, int amount) {
        if (recipient == null || recipient == this) {
            return false;
        }
        if (amount <= 0 || this.balance < amount) {
            return false;
        }

        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }
}
