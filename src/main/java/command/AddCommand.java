package command;

import calculator.CalculatorService;

public class AddCommand implements CalculatorCommand {
    private final int number;

    public AddCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() + number;
    }

    @Override
    public int undo(CalculatorService calculatorService) {
        return calculatorService.getCalculatorState() - number;
    }
}
