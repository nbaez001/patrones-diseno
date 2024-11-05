package com.empresa.proyecto.command;

import com.empresa.proyecto.model.BankAccount;

public abstract class Command {
    protected BankAccount account;
    protected double backup;

    public Command(BankAccount account) {
        this.account = account;
    }

    protected void saveBackup() {
        this.backup = account.getBalance();
    }

    public void undo() {
        account.setBalance(backup);
    }

    public abstract boolean execute();
}
