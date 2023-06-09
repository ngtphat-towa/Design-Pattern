package Chapter_06_COMMAND.JavaImp.PartyMode.commands.TV;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.TV;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
