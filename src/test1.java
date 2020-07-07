/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danceacadamy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandesh
 */
public class test1 {
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sandesh
 */

    public static void main(String args[])
    {
          
        Connection c=null;
        PreparedStatement ps=null;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/danceacadamy";
        String username="root";
        String password=" ";
         String sql="insert into Course value(?,?,2000);";
        
        try
        {
            Class.forName(driver);
            c=DriverManager.getConnection(url, username, password);
            ps=c.prepareStatement(sql);
            ps.setString(1,"20");
            ps.setString(2,"Westen Dance");
            ps.executeUpdate();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
}
}
    

