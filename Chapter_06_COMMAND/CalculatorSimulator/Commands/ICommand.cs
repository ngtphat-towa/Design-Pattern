namespace CalculatorSimulator.Commands;
public interface ICommand {
    void Execute();
    void Undo();
}