package Chapter_06_COMMAND.JavaImp.PartyMode.commands.Stereo;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Stereo;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}

