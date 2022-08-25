import calculator.CalculatorService;
import client.Client;
import command.CalculatorCommand;

public class Application {
    public static void main(String[] args) {
        Client client = new Client();
        CalculatorService calculatorService = new CalculatorService();

        while (true) {
            CalculatorCommand command = client.getNextCommandFromUser();
            calculatorService.receiveCommand(command);
            calculatorService.executeAllCommands();
        }
    }
}
