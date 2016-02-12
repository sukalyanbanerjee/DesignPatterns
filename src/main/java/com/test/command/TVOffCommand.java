package com.test.command;

public class TVOffCommand implements Command {
	
	private ElectronicDevice device;
	
	public TVOffCommand(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.off();
	}
	
	@Override
	public void undo() {
		device.on();
	}

}
