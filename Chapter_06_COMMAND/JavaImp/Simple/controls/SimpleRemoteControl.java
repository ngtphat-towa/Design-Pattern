package Chapter_06_COMMAND.JavaImp.Simple.controls;

import Chapter_06_COMMAND.JavaImp.Simple.commands.ICommand;

public class SimpleRemoteControl {
    ICommand slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(ICommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}