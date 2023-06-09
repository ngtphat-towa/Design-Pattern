package Chapter_06_COMMAND.JavaImp.LightRemoteWithMutiUndo;

public class Light {
    private String color;
    private boolean on;

    public Light(String color) {
        this.color = color;
        this.on = false;
    }

    public void on() {
        this.on = true;
        System.out.println(color + " light is on");
    }

    public void off() {
        this.on = false;
        System.out.println(color + " light is off");
    }

    public boolean isOn() {
        return on;
    }
}