/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 212649567694
 */
class JavaConnectDb {
    public static Connection ConnecrDb(){
     try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:XE";
           Connection conn= DriverManager.getConnection(url,"mydba","mydba");
        return conn;
	}catch(Exception e) {
            
             JOptionPane.showMessageDialog(null,e);
            
        }
     return null;
    }
   
}
