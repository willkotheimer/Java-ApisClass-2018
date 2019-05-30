package cooksys.day5;

public class Friend {

	private final String name;
	public Friend(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public synchronized void wave(Friend wavee) {
		System.out.println("Friend"+this.getName()+" has waved to "+wavee.name);
		wavee.waveBack(this);
	}
	public synchronized void waveBack(Friend waver) {
		System.out.println("Friend"+this.getName()+" has waved to "+waver.name);	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
