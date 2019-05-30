package cooksys.dayXML2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				
			//listens for socket to connect
			ServerSocket serversocket = new ServerSocket(8080);
			//our sides socket;
			Socket socket = serversocket.accept();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new DataInputStream(socket.getInputStream()));
			OutputStream fileOutputStream = new FileOutputStream("newText.txt");
			){
			byte[] bytes = new byte[bufferedInputStream.read()];
			System.out.println(bytes.length);
			bufferedInputStream.read(bytes);
			System.out.println(Arrays.toString(bytes));
			fileOutputStream.write(bytes);
			
		} catch(IOException ioException) {
			System.out.println("Server unable to connected to client or connection failed.");
		}
	}

}

