using CalculatorSimulator.Models;

namespace CalculatorSimulator.Commands;

public class SubtractCommand : ICommand {
    private Calculator calculator;
    private int operand;

    public SubtractCommand(Calculator calculator, int operand) {
        this.calculator = calculator;
        this.operand = operand;
    }

    public void Execute() {
        calculator.Subtract(operand);
    }

    public void Undo() {
        calculator.Add(operand);
    }
}
