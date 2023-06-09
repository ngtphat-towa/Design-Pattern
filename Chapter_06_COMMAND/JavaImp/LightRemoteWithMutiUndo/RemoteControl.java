package Chapter_06_COMMAND.JavaImp.LightRemoteWithMutiUndo;

import java.util.Stack;
/*
 * Using stack to do undo command
 */
public class RemoteControl {
    private Stack<Command> commandStack;

    public RemoteControl() {
        commandStack = new Stack<>();
    }

    public void pressButton(Command command) {
        command.execute();
        commandStack.push(command);
    }

    public void undoButton() {
        if (!commandStack.isEmpty()) {
            Command lastCommand = commandStack.pop();
            lastCommand.undo();
        }
    }
    
}