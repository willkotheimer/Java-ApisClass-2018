package cooksys.Server_Client_Concurrency;

public class Main {

	public static void main (String[] args) throws InterruptedException {
		
		
		for(int i=0; i<10; i++) {
			new Client().connect();
		}
	}
	
	
}
