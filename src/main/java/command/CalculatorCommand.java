package command;

import calculator.CalculatorService;

public interface CalculatorCommand {
    int execute(CalculatorService calculatorService);
    default void triggerExecute(CalculatorService calculatorService) {}
    int undo(CalculatorService calculatorService);
    default boolean isSavedInHistory() {
        return true;
    }
}
