package cooksys.Server_Client_Concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientHandler implements Runnable {

	private Socket clientSocket;
	
	public ClientHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
	public void run() {
		try 
		(
				BufferedReader br = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()))
				
				
				) {
			Thread.sleep(3000);
			System.out.println(br.readLine());
		} catch (IOException io) {
			io.printStackTrace();
			
		} 
		catch (InterruptedException ie) {
			ie.printStackTrace();
			
		}
		
	}
	
	public Socket getClientSocker() {
		return clientSocket;
	}

	
	
}
