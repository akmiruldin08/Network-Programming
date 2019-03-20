import java.io*;

import java.net.*;

class client

{

public static void main(String[] args) throw Exception

{

	Socket sock = new Socket(192.168.43.77", 7789);


	BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));

	OutputStream ostream = sock.getOutputStream();
	
	Printwriter pwrite = new PrintWriter(ostream, true);

	InputStream istream = sock.getInputStream();

	BufferedReader receiveRead = new bufferedReader(new InputStreamReader(istream));

	System.out.println("Start the conversation");

	String receiveMessage, sendMessage;

	while(true)

	{

		sendMessage = keyRead.readLine();
		
		pwrite.println(sendMessage);

	if((receiveMessage = receiveRead.readLine()) !=null)

		{
			
			System.out.println("Server: " + receiveMessage);

		}

}
}
}
