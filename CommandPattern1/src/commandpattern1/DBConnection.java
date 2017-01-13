/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern1;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DBConnection {
    public static Connection getConnection() {
	    
	    String DB_CONN_STRING = "jdbc:mysql://localhost:3306/DateDB";
	    String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	    String USER_NAME = "root";
	    String PASSWORD = "root";
	    
	    Connection conn = null;
//	    try {
//	       Class.forName(DRIVER_CLASS_NAME).newInstance();
//	    }
//	    catch (Exception ex) {
//	       System.out.println(ex.getMessage());
//	    }
//
//	    try {
//	      conn = DriverManager.getConnection(DB_CONN_STRING, USER_NAME, PASSWORD);
//	    }
//	    catch (SQLException e) {
//	    	System.out.println(e.getMessage());
//	    }
	    return conn;
	  }
	
	public static ArrayList<String> executeSelectSQL(String SQL) {
		
		ResultSet rs = null;
		ArrayList<String> lst = null;
		
//		try {
//			Connection conn = DBUtils.getConnection();
//			Statement stmt = conn.createStatement();
//			rs = stmt.executeQuery(SQL);
//			lst = new ArrayList<String>();
//			
//			while(rs.next()) {
//				lst.add(rs.getString(1));
//			}
//			conn.close();
//		}
//		catch(SQLException ex) {
//			System.out.println(ex.getMessage());
//		}
		System.out.println("Executing SELECT");
		return lst;
	}
	
	public static void executeUpdateSQL(String SQL) {
		
//		try {
//			Connection conn = DBUtils.getConnection();
//			Statement stmt = conn.createStatement();
//			stmt.executeUpdate(SQL);
//			conn.close();
//		}
//		catch(SQLException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		System.out.println("Executing UPDATE");
	}
    
}
