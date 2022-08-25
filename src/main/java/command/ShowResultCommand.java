package command;

import calculator.CalculatorService;

public class ShowResultCommand implements CalculatorCommand {
    @Override
    public int execute(CalculatorService calculatorService) {
        System.out.println(calculatorService.getCalculatorState());
        return calculatorService.getCalculatorState();
    }

    @Override
    public int undo(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState();
    }

    @Override
    public void triggerExecute(CalculatorService calculatorService) {
        calculatorService.executeAllCommands();
    }

    @Override
    public boolean isSavedInHistory() {
        return false;
    }
}
