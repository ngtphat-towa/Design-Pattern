package Chapter_06_COMMAND.JavaImp.LightRemoteWithMutiUndo;

public interface Command {
    void execute();
    void undo();
}