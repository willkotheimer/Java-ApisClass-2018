package day2;



public class Cycle {

	private int wheels;
	
	public Cycle() {};
	
	public Cycle(int wheels) {
		this.wheels=wheels;
	}
	
	public void ride() {
		
		System.out.println("I'm going for a ride");
		
	}
	public int getWheels() {
		return wheels;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle[] cycles= {new Unicycle(), new Bicycle(), new Tricycle()};
		
		for(Cycle c: cycles) {
			c.ride();
		}
		
	}

}
