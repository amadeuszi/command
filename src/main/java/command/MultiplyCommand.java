package command;

import calculator.CalculatorService;

public class MultiplyCommand implements CalculatorCommand {
    private final int number;

    public MultiplyCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() * number;
    }

    @Override
    public int undo(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() / number;
    }
}
