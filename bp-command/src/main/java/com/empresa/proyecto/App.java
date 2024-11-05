package com.empresa.proyecto;

import com.empresa.proyecto.command.Command;
import com.empresa.proyecto.command.DepositCommand;
import com.empresa.proyecto.command.TransferCommand;
import com.empresa.proyecto.command.WithdrawCommand;
import com.empresa.proyecto.model.BankAccount;

import java.util.Stack;

public class App {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 500);
        BankAccount account2 = new BankAccount("67890", 1000);
        App app = new App();

        app.executeCommand(new DepositCommand(account1, 100));
        app.executeCommand(new WithdrawCommand(account1, 50));
        app.executeCommand(new TransferCommand(account1, account2, 200));

        System.out.println("Undoing last transaction:");
        app.undoLastCommand();

        System.out.println("Undoing another transaction:");
        app.undoLastCommand();
    }
}
