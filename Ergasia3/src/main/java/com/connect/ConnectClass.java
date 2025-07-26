package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectClass {
        

	public static Connection dbCon() {
		Connection con=null;
		String url ="jdbc:postgresql://localhost:5432/grammateia";
		String user ="postgres";
		String password="0000";
            
            
        try {
        	con=DriverManager.getConnection(url,user,password);
        	
        	if(con!=null) {
        		System.out.println("Connected");
        	}else {
        		System.out.println("Failed");
        	}
        }catch(SQLException e) {
        	System.out.println(e.getMessage());
        }
        	
        return con;
	}
}
