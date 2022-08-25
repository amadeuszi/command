package command;

public class SubtractCommand implements CalculatorCommand {
    private final int number;

    public SubtractCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(int secondNumber) {
        return secondNumber - number;
    }
}