package Chapter_06_COMMAND.JavaImp.PartyMode.commands.Stereo;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
       stereo.on();
    }

}
