package com.test.command;

public class TVVolumeUpCommand implements Command {
	
	private ElectronicDevice device;
	
	public TVVolumeUpCommand(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volumeUp();
	}
	
	@Override
	public void undo() {
		device.volumeDown();
	}

}
