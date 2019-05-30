package cooksys.Server_Client_Concurrency;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {

	private static AtomicInteger currentClients = new AtomicInteger(0);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try(ServerSocket serversocket = new ServerSocket(8080);) { 
				while(true) {	
					
					new Thread( new ClientHandler(serversocket.accept())).start();
					
					Server.addClient();
				}
				
				
				
			}
			
				catch (IOException io) {
					io.printStackTrace();
					
				}
			
			
		}
	
	static public int addClient() {
		return Server.currentClients.incrementAndGet();
		
	}
	
	static public int removeClient() {
		return Server.currentClients.decrementAndGet();
		
	}
	}


