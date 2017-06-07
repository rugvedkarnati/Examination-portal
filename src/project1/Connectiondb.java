/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.sql.*;
import java.sql.Connection;
import oracle.jdbc.*;
import java.sql.DriverManager;/**
 * 
 *
 * @author Rugved
 */
public class Connectiondb {
    public static Connection getConnection(){
        Connection con=null;
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "DESKTOP-6CGJ177";
            String serverPort = "1521";
            String sid = "XE";
            con= DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-6CGJ177:1521:XE","rugved","rugvedsai627");
            System.out.println("Succesfully Connected to the Database!");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Could not find the database driver"+e.getMessage());
        }
        catch(SQLException e)
        {
            System.out.println("Could not connect to the databse"+e.getMessage());
        }

    return con;
    }
}
    
