package Chapter_06_COMMAND.JavaImp.Remote.commands.Light;

import Chapter_06_COMMAND.JavaImp.Remote.commands.Command;
import Chapter_06_COMMAND.JavaImp.Remote.models.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
