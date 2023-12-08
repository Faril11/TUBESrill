/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author fazru
 */
public class koneksi {
    public Connection koneksi () throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirindomaret","root","");
     return conn; }
    
    
    
}
