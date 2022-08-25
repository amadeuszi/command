package calculator;

import command.CalculatorCommand;

import java.util.ArrayList;
import java.util.List;

public class CalculatorService {
    private final List<CalculatorCommand> history;

    private int calculatorState;

    private int currentExecutedCommandIndex;

    public CalculatorService() {
        this.history = new ArrayList<>();
        calculatorState = 0;
        currentExecutedCommandIndex = -1;
    }

    public void receiveCommand(CalculatorCommand command) {
        history.add(command);
    }

    public void executeAllCommands() {
        while (currentExecutedCommandIndex < history.size() - 1) {
            currentExecutedCommandIndex++;
            calculatorState = history.get(currentExecutedCommandIndex).execute(calculatorState);
        }
    }
}
