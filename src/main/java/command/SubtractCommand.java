package command;

import calculator.CalculatorService;

public class SubtractCommand implements CalculatorCommand {
    private final int number;

    public SubtractCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() - number;
    }

    @Override
    public int undo(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() + number;
    }
}