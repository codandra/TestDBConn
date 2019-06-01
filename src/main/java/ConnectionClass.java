import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andra
 */
public class ConnectionClass {
    public static Statement getStatement(){
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456789")){
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/test", "root", "123456789");
            return conn.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // conn.close();
        }
        return null;
    }
    
}
