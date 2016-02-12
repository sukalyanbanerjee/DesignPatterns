package com.test.command;

public class TVVolumeDownCommand implements Command {
	
	private ElectronicDevice device;
	
	public TVVolumeDownCommand(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volumeDown();
	}
	
	@Override
	public void undo() {
		device.volumeUp();
	}

}
