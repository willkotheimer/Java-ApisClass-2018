package day2;

public class MallardDuck implements Flyable, Duck {

	private FlyBehavior flybehavior;
	
	public MallardDuck() {
		this.flybehavior= new FlyBehavior();
	}
	
	//Delegation
	public void fly() {
		flybehavior.fly();
	}
	
	public void quack() {
		System.out.println("Quack");
	}
	
	public void swim() {}
	
	}
