package Chapter_06_COMMAND.JavaImp.Remote.commands.GarageDoor;

import Chapter_06_COMMAND.JavaImp.Remote.commands.Command;
import Chapter_06_COMMAND.JavaImp.Remote.models.GarageDoor;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

}
