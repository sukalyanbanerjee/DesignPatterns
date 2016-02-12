package com.test.command;

public class TVOnCommand implements Command {
	
	private ElectronicDevice device;
	
	public TVOnCommand(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.on();
	}
	
	@Override
	public void undo() {
		device.off();
	}

}
