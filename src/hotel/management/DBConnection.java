package hotel.management;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.jvm.hotspot.HelloWorld.e;


public class DBConnection {

    
    
 
    
    private static String USERNAME = "DBuser";
   private static  String PASSWORD = "12345";
    private static String CONN = "jdbc:mysql://localhost/payments?useTimezone=true&serverTimezone=UTC";
   

   //Am in now
 
    public static Connection getConnction() throws SQLException{
     return  DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
    }
     
}
