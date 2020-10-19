
import java.sql.*;
import javax.swing.JOptionPane;
public class connection {
    Connection conn;
    
    public static Connection Connectdb(){
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:database.db");
        return conn;
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
    }