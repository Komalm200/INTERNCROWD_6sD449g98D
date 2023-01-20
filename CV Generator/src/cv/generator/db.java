/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.generator;

/**
 *
 * @author Hyrex
 */

import java.sql.*;
import javax.swing.*;
public class db {
    
    
    
    Connection conn=null;
    public static Connection java_db(){
        
        try{
//            Class.forName("org.sqlite.JDBC");
//            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hyrex\\Documents\\NetBeansProjects\\CV Generator\\cvdatabase.sqlite");
//            JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
        	Class.forName("org.sqlite.JDBC");//E:\Downloads\sqlite-dll-win64-x64-3400100
            Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\Downloads\\CV-Builder\\CV Generator\\cvdatabase.sqlite");
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
