package day1;

public class Orc {

	private String name;
	private int health;
	
	public Orc(int health, String name) {
		super();
		this.name = name;
		this.health = health;
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
		return (this.getHealth()>=0);
	}
		public void attack(Warrior warrior) {
			warrior.setHealth(warrior.getHealth()-2);
			
		}
	
	
}
