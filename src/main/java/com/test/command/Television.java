package com.test.command;

public class Television implements ElectronicDevice {
	
	private int volume = 0;

	@Override
	public void on() {
		System.out.println("TV On...");
	}

	@Override
	public void off() {
		System.out.println("TV Off...");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("Volume up to " + volume);
	}

	@Override
	public void volumeDown() {
		volume--;
		System.out.println("Volume down to " + volume);
	}

}
