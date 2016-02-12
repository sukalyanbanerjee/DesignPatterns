package com.test.command;

public class ClientApp {

	public static void main(String[] args) {

		Television device = new Television();
		Command tvOnCommand = new TVOnCommand(device);
		RemoteControl remoteControl = new RemoteControl(tvOnCommand);
		remoteControl.buttonPressed();

		/*---------------------------*/

		Command tvVolumeUpCommmand = new TVVolumeUpCommand(device);
		remoteControl = new RemoteControl(tvVolumeUpCommmand);
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();
		remoteControl.buttonPressedUndo();
		

		/*--------------------------*/

		Command tvVolumeDownCommmand = new TVVolumeDownCommand(device);
		remoteControl = new RemoteControl(tvVolumeDownCommmand);
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();
		remoteControl.buttonPressed();

		/*--------------------------*/

		Command tvOffCommmand = new TVOffCommand(device);
		remoteControl = new RemoteControl(tvOffCommmand);
		remoteControl.buttonPressed();
		remoteControl.buttonPressedUndo();
		
	}

}
