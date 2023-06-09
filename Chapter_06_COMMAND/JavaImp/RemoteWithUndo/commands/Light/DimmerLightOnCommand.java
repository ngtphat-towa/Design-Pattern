package Chapter_06_COMMAND.JavaImp.RemoteWithUndo.commands.Light;

import Chapter_06_COMMAND.JavaImp.RemoteWithUndo.commands.Command;
import Chapter_06_COMMAND.JavaImp.RemoteWithUndo.models.Light;

public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
