package Chapter_06_COMMAND.JavaImp.Simple;

import Chapter_06_COMMAND.JavaImp.Simple.commands.GarageDoorOpenCommand;
import Chapter_06_COMMAND.JavaImp.Simple.commands.LightOnCommand;
import Chapter_06_COMMAND.JavaImp.Simple.controls.SimpleRemoteControl;
import Chapter_06_COMMAND.JavaImp.Simple.models.GarageDoor;
import Chapter_06_COMMAND.JavaImp.Simple.models.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
       
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();


    }
}