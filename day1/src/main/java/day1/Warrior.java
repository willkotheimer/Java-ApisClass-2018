package day1;

public class Warrior {

	private String name;
	private int health;
	
	public Warrior(int i, String n) {
		// TODO Auto-generated constructor stub
		this.health = i; 
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public boolean alive() {
		return (this.getHealth()>0);
	}
	public void attack(Orc orc) {
		orc.setHealth(orc.getHealth()-2);
		
	}
	
	public void heal() {
		this.setHealth(this.getHealth()+5);
		
	}
	
	
	
}
