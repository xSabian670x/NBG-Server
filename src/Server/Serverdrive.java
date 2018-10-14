package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Serverdrive 
{
     public static void main(String args[])
        {
            boolean c = false;
            server srv = new server();
           c= srv.startserver();
           if(c==true)
           {
               System.out.println("Sucess 2");
           }
            
            
            
            
        }
    
    
}

