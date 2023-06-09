package Chapter_06_COMMAND.JavaImp.Simple.commands;

import Chapter_06_COMMAND.JavaImp.Simple.models.Light;

public class LightOffCommand implements ICommand {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
