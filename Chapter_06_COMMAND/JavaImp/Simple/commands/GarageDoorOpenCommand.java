package Chapter_06_COMMAND.JavaImp.Simple.commands;

import Chapter_06_COMMAND.JavaImp.Simple.models.GarageDoor;

public class GarageDoorOpenCommand implements ICommand{
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    GarageDoor garageDoor;
    
    @Override
    public void execute() {
        garageDoor.up();
    }
    
}
