package cooksys.day5;

public class Main {

	public static void main (String[] args) throws InterruptedException {
//	int maincounter = 0; 
//	//We'll start app on this thread
//	
//	App a = new App(0);
//	
//	//have to pass in an object that implements startnable
//	/*for(int i=0; i<10; i++) {
//		 Thread t = new Thread(a);
//		 t.start();
//		 t.join(); //thread safaty
//	}*/
//	
//
//	Thread thread0 = new Thread(a);
//	 thread0.start();
//	 Thread thread1 = new Thread(a);
//	 thread1.start();
//	 
//	 thread0.join();
//	 thread1.join();;
//	 
//	 
//	 
//	
//	for(int i=0; i<10;i++) {
//		
//	maincounter++;
//	}
//	
//	
//	System.out.println("Main Counter:"+maincounter);
//	//System.out.println("App Counter:"+a.getCounter());

	final Friend quinton = new Friend("Quinton");
	final Friend will = new Friend("Will");
	
	
			
			new Thread(new Runnable() {
				public void run() {
					will.wave(quinton);
			}}).start();
			
			new Thread(new Runnable() {
				public void run() {
					quinton.wave(will);
				}
			}).start();
			
			
	}			

}
