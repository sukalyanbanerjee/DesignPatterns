package com.test.command;

public class RemoteControl {
	
	private Command command;
	
	public RemoteControl(Command command) {
		this.command = command;
	}
	
	public void buttonPressed() {
		command.execute();
	}
	
	public void buttonPressedUndo() {
		command.undo();
	}
	
}
