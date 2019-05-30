package cooksys.dayXML2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Socket client = new Socket("localhost", 8080);
				OutputStream BufferedOutputStream = new BufferedOutputStream(new DataOutputStream(client.getOutputStream()));
				InputStream fileInputStream = new FileInputStream("text.txt");
				) {
			
			byte[] bytes = new byte[fileInputStream.available()];
			fileInputStream.read(bytes);
			System.out.println(bytes.length);
			System.out.println(Arrays.toString(bytes));
			BufferedOutputStream.write(bytes.length);
			BufferedOutputStream.write(bytes);
			BufferedOutputStream.flush();
			
			
		} catch(IOException e) {
			System.out.println("cuold not connect to the server");
		}
		
		
	}

}
