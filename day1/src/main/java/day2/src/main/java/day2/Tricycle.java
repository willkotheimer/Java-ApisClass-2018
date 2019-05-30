package day2;

public class Tricycle extends Cycle {

private int wheels; 
	
	public Tricycle() {
		super(3);
		
	}

	public int getWheels() {
		return wheels;
	}
	
	
		public void ride() {
			System.out.println("I'm going for a ride on "+super.getWheels()+ "wheels!");
		}
	

	@Override
	public String toString() {
		return "I'm going for a ride on "+this.wheels+ " wheels!";
		}
		
	
}
