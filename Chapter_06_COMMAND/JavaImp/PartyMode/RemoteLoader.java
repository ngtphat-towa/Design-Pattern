package Chapter_06_COMMAND.JavaImp.PartyMode;

import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Command;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.MacroCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Hottub.HottubOffCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Hottub.HottubOnCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Light.LightOffCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Light.LightOnCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Stereo.StereoOffCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.Stereo.StereoOnCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.TV.TVOffCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.commands.TV.TVOnCommand;
import Chapter_06_COMMAND.JavaImp.PartyMode.controls.RemoteControl;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Hottub;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Light;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.Stereo;
import Chapter_06_COMMAND.JavaImp.PartyMode.models.TV;

public class RemoteLoader {
    public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
