package command;

public class AddCommand implements CalculatorCommand {
    private final int number;

    public AddCommand(int number) {
        this.number = number;
    }

    @Override
    public int execute(int secondNumber) {
        return number + secondNumber;
    }
}
