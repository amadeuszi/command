package command;

import calculator.CalculatorService;

public class UndoCommand implements CalculatorCommand {

    @Override
    public int execute(CalculatorService calculatorService) {
        calculatorService.undo();
        return calculatorService.getCalculatorState();
    }

    @Override
    public int undo(CalculatorService calculatorService) {
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public boolean isSavedInHistory() {
        return false;
    }

    @Override
    public void triggerExecute(CalculatorService calculatorService) {
        calculatorService.executeAllCommands();
    }
}
