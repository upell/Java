/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {
    String url = "jdbc:mysql://localhost:3306/dbzakat";
    public Connection con;

    // constructor
    public ConnectionDB(){
    	getConnection();
    }

    public Connection getConnection(){
    	try {
            Class.forName("com.mysql.jdbc.Driver");
	}catch (ClassNotFoundException e){
            System.err.print("Koneksi gagal: ");
            System.err.println(e.getException());
	}

	try {
            con = DriverManager.getConnection(url, "root","");
//            System.out.print("Koneksi sukses");
	}catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Ke Database Gagal, Silakan Hubungi Contact Kami");
	}

	return con;
    }
    
}
