package Chapter_06_COMMAND.JavaImp.SimpleFI;

import Chapter_06_COMMAND.JavaImp.SimpleFI.controls.SimpleRemoteControl;
import Chapter_06_COMMAND.JavaImp.SimpleFI.models.GarageDoor;
import Chapter_06_COMMAND.JavaImp.SimpleFI.models.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		remote.setCommand(light::on);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::up);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor::lightOff);
		remote.buttonWasPressed();
    }

}
