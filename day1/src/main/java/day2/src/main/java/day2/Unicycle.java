package day2;



public class Unicycle extends Cycle{
	
	private int wheels; 
	
	public Unicycle() {
		super(1);
		
	}

	public int getWheels() {
		return wheels;
	}
	
	public void ride() {
		System.out.println("I'm going for a ride on "+super.getWheels()+ "wheels!");
	}

	@Override
	public String toString() {
		return "I'm going for a ride on "+this.wheels+ "wheels!";
		}
		

	
}
