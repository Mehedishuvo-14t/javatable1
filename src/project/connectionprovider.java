/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Shovo
 */
import java.sql.*;
public class connectionprovider {
    public static Connection getcon(){
        try{
       Class.forName("com.mysql.jdbc.Driver"); 
       
     Connection  con=DriverManager.getConnection("jdbc:mysql://localhost/newstudent","root","");
       return con;
    }catch(Exception e){
       System.out.println(e);
       return null;
    } 
    }
}
