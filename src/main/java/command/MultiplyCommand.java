package command;

public class MultiplyCommand implements CalculatorCommand {
    private final int number;

    public MultiplyCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(int secondNumber) {
        return number * secondNumber;
    }
}
