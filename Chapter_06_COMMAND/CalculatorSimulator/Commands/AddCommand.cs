using CalculatorSimulator.Models;

namespace CalculatorSimulator.Commands;

public class AddCommand : ICommand {
    private Calculator calculator;
    private int operand;

    public AddCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void Execute() {
        calculator.Add(operand);
    }

    public void Undo() {
        calculator.Subtract(operand);
    }
}
