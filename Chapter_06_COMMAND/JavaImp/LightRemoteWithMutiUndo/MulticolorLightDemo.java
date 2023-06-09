package Chapter_06_COMMAND.JavaImp.LightRemoteWithMutiUndo;

 public class MulticolorLightDemo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light redLight = new Light("Red");
        Light greenLight = new Light("Green");
        Light blueLight = new Light("Blue");

        Command redLightOn = new LightOnCommand(redLight);
        Command redLightOff = new LightOffCommand(redLight);
        Command greenLightOn = new LightOnCommand(greenLight);
        Command greenLightOff = new LightOffCommand(greenLight);
        Command blueLightOn = new LightOnCommand(blueLight);
        Command blueLightOff = new LightOffCommand(blueLight);

        		System.out.println(remoteControl);


        remoteControl.pressButton(redLightOn);
        remoteControl.pressButton(greenLightOn);
        remoteControl.pressButton(blueLightOn);

        remoteControl.undoButton();
        remoteControl.undoButton();
        
        remoteControl.pressButton(redLightOff);
        
        remoteControl.undoButton();
        
        remoteControl.pressButton(greenLightOff);
        
        remoteControl.undoButton();
        
        remoteControl.pressButton(blueLightOff);
        
        remoteControl.undoButton();
        
     }
}