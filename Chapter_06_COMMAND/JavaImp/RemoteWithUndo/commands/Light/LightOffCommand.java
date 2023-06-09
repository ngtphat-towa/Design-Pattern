package Chapter_06_COMMAND.JavaImp.RemoteWithUndo.commands.Light;

import Chapter_06_COMMAND.JavaImp.RemoteWithUndo.commands.Command;
import Chapter_06_COMMAND.JavaImp.RemoteWithUndo.models.Light;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
        level = light.getLevel();
		light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
