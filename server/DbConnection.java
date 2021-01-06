package server;

import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public  Connection getConnection() throws Exception
    {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/ps";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("yaay");
            return connection;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;

    }

    public static void main(String[] args) {
        String jdbc = "jdbc:mysql://localhost:3306/ps?";
        String user = "root";
        String pass = "";
        DbConnection con = new DbConnection();

        try {
            //System.out.println("Connect " + jdbc);
            Connection myConn = con.getConnection();
           // System.out.println("Succes");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}


