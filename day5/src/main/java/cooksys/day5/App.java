package cooksys.day5;



public class App implements Runnable
{

	private int counter;
	
	
	public App(int counter) {
		this.counter=counter;
		
	}
	
	
	
	public void run() {
	// TODO Auto-generated method stub
		//for(int i=0; i<10;i++) {
			
			//syso incrementing the counter
		for(int i=0; i<10; i++) {
			this.incrementCounter();
			System.out.println("Current Thread:" + Thread.currentThread()+"Current Count:"+this.counter);

		}
		//}
		
		
	}
	
	public int getCounter() {
		return counter;
	}
	
	public synchronized void incrementCounter() {
		this.counter++;
	}
  
	
}
