namespace CalculatorSimulator.Commands;

public class Command : ICommand {
    private Action execute;
    private Action undo;

    public Command(Action execute, Action undo) {
        this.execute = execute;
        this.undo = undo;
    }

    public void Execute() {
        execute();
    }

    public void Undo() {
        undo();
    }
}