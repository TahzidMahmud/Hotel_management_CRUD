package hotelmanagementapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBconnection {
    public static Connection GetConnection() {
       try{
          com.mysql.jdbc.Connection conn=null;
          //Statement stmt=null;
            Class.forName("com.mysql.jdbc.Driver");
          conn=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel-room", "root", "");
          return conn;
        }
        catch(ClassNotFoundException| SQLException e){
            Logger.getLogger(HotelManagementApp.class.getName()).log(Level.SEVERE,null,e);
            
         return null;
        }
        
    }
}


