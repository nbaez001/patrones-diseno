package com.empresa.proyecto.command;

import com.empresa.proyecto.model.BankAccount;

public class WithdrawCommand extends Command {
    private double amount;

    public WithdrawCommand(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public boolean execute() {
        if (account.getBalance() >= amount) {
            saveBackup();
            account.withdraw(amount);
            return true;
        }
        return false;
    }
}
