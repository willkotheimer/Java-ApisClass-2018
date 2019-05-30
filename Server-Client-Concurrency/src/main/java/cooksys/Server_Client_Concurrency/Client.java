package cooksys.Server_Client_Concurrency;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try (Socket clientSocket = new Socket("localhost", 8080);
				BufferedWriter bw = new BufferedWriter(new PrintWriter(clientSocket.getOutputStream()));
				) {
			
			bw.write("Hello World");
			bw.flush();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public void connect () {
		// TODO Auto-generated method stub
		try (Socket clientSocket = new Socket("localhost", 8080);
				BufferedWriter bw = new BufferedWriter(new PrintWriter(clientSocket.getOutputStream()));
				) {
			
			bw.write("Hello World");
			bw.flush();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
