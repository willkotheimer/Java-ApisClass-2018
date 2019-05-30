package day1;

public class Car {

	@SuppressWarnings("unused")
	private final int wheels = 4; 
	private String color;
	private int miles;
	private boolean isOn;
	
	public Car(String color) {
		this.color=color;
		this.miles=0;
		this.isOn=false;
		
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void start() {
		this.isOn = true;
	}
	public void turnOff() {
		this.isOn = false;
	}
	public int drive(int milesToDrive) {
		if (milesToDrive>0 && this.isOn()) {
			this.miles = this.miles + milesToDrive;
		}
		
		return this.miles;
	}
	
	
}
