package Chapter_06_COMMAND.JavaImp.PartyMode.commands.Stereo;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Stereo;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
	}
}