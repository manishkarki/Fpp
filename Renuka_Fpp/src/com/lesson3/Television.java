package com.lesson3;

public class Television {
	private String manufacturer;
	private int screen_size;
	private boolean powerOn;
	private int channel;
	private int volume;

	public Television(String brand, int size) {
		this.manufacturer = brand;
		this.screen_size = size;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getScreen_size() {
		return screen_size;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void increaseVolume() {
		if (this.volume < 50 && this.powerOn) {
			this.volume += 1;
			System.out.println("volume increased!");
		}
	}

	public void decreaseVolume() {
		if (this.volume > 0 && powerOn) {
			this.volume -= 1;
			System.out.println("Volume decreased!");
		}
	}

	public void power() {
		if (this.powerOn)
			this.powerOn = false;
		else {
			this.powerOn = true;
			System.out.println("Power on");
		}
	}
}
