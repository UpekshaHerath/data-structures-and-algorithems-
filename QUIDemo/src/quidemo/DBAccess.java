
package quidemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {
    //
    String dburl = "jdbc:sqlserver://localhost:1433;databaseName=MySalesDB;integratedSecurity=true";
    
    public boolean insertUpdateDeleteData(String query) {
        boolean result = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("first");
            Connection conn = DriverManager.getConnection(dburl);
            System.out.println("second");
            Statement smt = conn.createStatement();
            System.out.println("third");
            int rowCount = smt.executeUpdate(query);
            System.out.println("forth");
            if (rowCount != 0) {
                result = true;
                System.out.println("OK");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the driver");
        } catch (SQLException ex) {
            System.out.println("Unable to connect the SQL driver");
        }
        return result;
    }
}
