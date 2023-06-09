using CalculatorSimulator.Commands;

namespace CalculatorSimulator.CalculatorControls;

public class LamdaCalculatorControl
{
    private Stack<ICommand> undoStack;
    private Stack<ICommand> redoStack;

    public LamdaCalculatorControl() {
        undoStack = new Stack<ICommand>();
        redoStack = new Stack<ICommand>();
    }

    public void ExecuteCommand(ICommand command) {
        command.Execute();
        undoStack.Push(command);
        redoStack.Clear();
    }

    public void Undo() {
        if (undoStack.Count > 0) {
            ICommand lastCommand = undoStack.Pop();
            lastCommand.Undo();
            redoStack.Push(lastCommand);
        }
    }

    public void Redo() {
        if (redoStack.Count > 0) {
            ICommand lastCommand = redoStack.Pop();
            lastCommand.Execute();
            undoStack.Push(lastCommand);
        }
    }
}