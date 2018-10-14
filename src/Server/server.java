package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class server {
	private ServerSocket servesocket;
	private Socket socket;
	private ObjectOutputStream out;
	private ObjectInputStream in;

       
        
        
        
        
        
	public boolean startserver()
	{
		boolean s = false;
        
             try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection link = null;
                    link = DriverManager.getConnection("jdbc:mysql://localhost/MySQL80","root", "keyword");
                    //                                 replace this ^ with yours to get it to work
                    System.out.print("SUCCESS");
                   s = true;

                }
            catch( ClassNotFoundException | SQLException e)
                {
                    e.printStackTrace();
                    System.out.println("FAIL LOLOLOLOL");
                }
        return s;
	}
	
	public void Streams()
	{
		try
		{
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void end()
	{
		try
		{
			in.close();
			out.close();
			socket.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}

