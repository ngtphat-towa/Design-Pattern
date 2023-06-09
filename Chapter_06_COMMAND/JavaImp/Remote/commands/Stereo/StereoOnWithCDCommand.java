package Chapter_06_COMMAND.JavaImp.Remote.commands.Stereo;

import Chapter_06_COMMAND.JavaImp.Remote.commands.Command;
import Chapter_06_COMMAND.JavaImp.Remote.models.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

}
