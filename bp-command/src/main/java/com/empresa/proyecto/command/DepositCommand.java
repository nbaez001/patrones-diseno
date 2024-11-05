package com.empresa.proyecto.command;

import com.empresa.proyecto.model.BankAccount;

public class DepositCommand extends Command {
    private double amount;

    public DepositCommand(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public boolean execute() {
        saveBackup();
        account.deposit(amount);
        return true;
    }
}