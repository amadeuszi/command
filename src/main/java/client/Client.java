package client;

import command.*;

import java.util.Scanner;

public class Client {
    public Client() {
        System.out.println("Available commands: ");
        System.out.println("show - shows calculator result");
        System.out.println("add <number> - adds <number> to the result");
        System.out.println("subtract <number> - subtracts <number> from the result");
        System.out.println("multiply <number> - multiply <number> and the result");
        System.out.println("example: 'add 3' will add 3 to the result");
    }

    public CalculatorCommand getNextCommandFromUser() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        if ("show".equals(userInput)) {
            return new ShowResultCommand();
        } else if ("add".equals(userInput)) {
            int number = scanner.nextInt();
            return new AddCommand(number);
        } else if ("multiply".equals(userInput)) {
            int number = scanner.nextInt();
            return new MultiplyCommand(number);
        } else if ("subtract".equals(userInput)) {
            int number = scanner.nextInt();
            return new SubtractCommand(number);
        }

        throw new RuntimeException("Wrong input from user");
    }
}
