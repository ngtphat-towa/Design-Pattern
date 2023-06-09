package Chapter_06_COMMAND.JavaImp.Simple.commands;

import Chapter_06_COMMAND.JavaImp.Simple.models.Light;

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}