package hotel.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    private static final String USERNAME = "DBuser";
    private static final String PASSWORD = "12345";
    private static final String CONN = "jdbc:mysql://localhost/payments?useTimezone=true&serverTimezone=UTC";
   

   //Am in now
    
    public static Connection getConnction() throws SQLException{
     return  DriverManager.getConnection(CONN,USERNAME,PASSWORD); 
    }
     
}
