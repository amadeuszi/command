package command;

public class ShowResultCommand implements CalculatorCommand {
    @Override
    public int execute(int secondNumber) {
        System.out.println("Current result: " + secondNumber);
        return secondNumber;
    }
}
