package Chapter_06_COMMAND.JavaImp.Remote;

import Chapter_06_COMMAND.JavaImp.Remote.commands.CeilingFan.CeilingFanOffCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.CeilingFan.CeilingFanOnCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.GarageDoor.GarageDoorDownCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.GarageDoor.GarageDoorUpCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.Light.LightOffCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.Light.LightOnCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.Stereo.StereoOffCommand;
import Chapter_06_COMMAND.JavaImp.Remote.commands.Stereo.StereoOnWithCDCommand;
import Chapter_06_COMMAND.JavaImp.Remote.controls.RemoteControl;
import Chapter_06_COMMAND.JavaImp.Remote.models.CeilingFan;
import Chapter_06_COMMAND.JavaImp.Remote.models.GarageDoor;
import Chapter_06_COMMAND.JavaImp.Remote.models.Light;
import Chapter_06_COMMAND.JavaImp.Remote.models.Stereo;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
	}
}
