/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hb516315
 */
public class ConnectionProvider {
     public static  Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem1", "root", "hari@1993");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
           return null; 
        }
    }
}
