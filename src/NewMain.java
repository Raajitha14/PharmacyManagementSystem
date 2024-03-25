/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class NewMain {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Connection con;
         PreparedStatement pst;
       
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacydb", "root", "Sql@2003");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
         } 
      
      
    }
    
}
