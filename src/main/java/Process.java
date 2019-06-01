
import java.sql.ResultSet;
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
public class Process {

    public static String getDescription() {
        String description = "";
        try {
            Statement st = ConnectionClass.getStatement();
            ResultSet rs = st.executeQuery("select description from users");
            while (rs.next()) {
                 description = rs.getString("description");
            System.out.println("andra:" + description);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println("andra:" + description);
        return description;
    } 

}
