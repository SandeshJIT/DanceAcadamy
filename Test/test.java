
import danceacadamy.LoginForm;
import danceacadamy.NewCourse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sandesh
 */
public class test {
    public static void main(String args[])
    {
          
                                        
        Connection c=null;
        Statement ps=null;
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/danceacadamy";
        String username="root";
        String password="9343735358662404000s";
         String sql="inseti into Course value('10','sandesh',2000);";
        
        try
        {
            Class.forName(driver);
            c=DriverManager.getConnection(url, username, password);
            ps=c.createStatement();
            ps.executeUpdate(sql);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
