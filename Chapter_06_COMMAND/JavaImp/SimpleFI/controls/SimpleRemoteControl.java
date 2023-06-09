package Chapter_06_COMMAND.JavaImp.SimpleFI.controls;

import Chapter_06_COMMAND.JavaImp.SimpleFI.commands.ICommand;

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