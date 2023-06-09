package Chapter_06_COMMAND.JavaImp.Remote.commands.GarageDoor;

import Chapter_06_COMMAND.JavaImp.Remote.commands.Command;
import Chapter_06_COMMAND.JavaImp.Remote.models.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

}
