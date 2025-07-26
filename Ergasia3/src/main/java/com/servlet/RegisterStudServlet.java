package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.ConnectClass;


@WebServlet("/RegisterStudServlet")
public class RegisterStudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
          	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		try {

			Class.forName("org.postgresql.Driver"); 
			
			Connection con = ConnectClass.dbCon();
			
			
			PrintWriter out = response.getWriter();
			
			String name= request.getParameter("name");
			String surname= request.getParameter("surname");
			String username= request.getParameter("username");
			String password= request.getParameter("password");
			int semester= Integer.parseInt(request.getParameter("semester"));
			
			PreparedStatement ps= con.prepareStatement("INSERT INTO mathites(name, surname, username, password, semester) VALUES(?,?,?,?,?);"); 
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setInt(5, semester);

			int rows= ps.executeUpdate();
			
			if (rows>0) {
            	out.println("Successful register");	          	
            }
									
			con.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}			
		
	}
}
