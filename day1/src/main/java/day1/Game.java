package day1;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Warrior bob = new Warrior(10,"Aragon");
		Orc orc = new Orc(20,"Malik");
		
		while(orc.alive()!=false) {
			bob.attack(orc);
			
			orc.attack(bob);
			bob.heal();
			
			if(orc.alive()==false) {
				System.out.println(bob.getName()+" won the fight");
			}
			if(bob.alive()==false) {
				System.out.println(orc.getName()+" won the fight");
			}
		}
		

	}

}
