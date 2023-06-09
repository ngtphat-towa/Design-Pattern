package Chapter_06_COMMAND.JavaImp.Remote.commands.CeilingFan;

import Chapter_06_COMMAND.JavaImp.Remote.commands.Command;
import Chapter_06_COMMAND.JavaImp.Remote.models.CeilingFan;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
