package com.empresa.proyecto.command;

import com.empresa.proyecto.model.BankAccount;

public class TransferCommand extends Command {
    private BankAccount toAccount;
    private double amount;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount) {
        super(fromAccount);
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public boolean execute() {
        if (account.getBalance() >= amount) {
            saveBackup();
            account.withdraw(amount);
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public void undo() {
        toAccount.withdraw(amount);
        account.deposit(amount);
    }
}
