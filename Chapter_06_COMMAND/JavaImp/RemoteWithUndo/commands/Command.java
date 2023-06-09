package Chapter_06_COMMAND.JavaImp.RemoteWithUndo.commands;

public interface Command {
	public void execute();
	// Add undo 
	public void undo();
}
