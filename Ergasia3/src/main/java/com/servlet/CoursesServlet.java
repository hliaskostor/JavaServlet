package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.ConnectClass;

@WebServlet("/CoursesServlet")
public class CoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = ConnectClass.dbCon();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String sql= "select * from mathimata";
			Statement st= con.createStatement();
			ResultSet rs= st.executeQuery(sql);
				
			out.print("<table border ='3'><tr><th>Course ID</th><th>Course name</th><th>Professor ID</th></tr>");
			
			while (rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getString("id"));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString("name"));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString("id_kathigiti"));
				out.print("</td>");
	        	out.print("</tr>");
			}
			
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
 
			e.printStackTrace();
		} 			
	}	
}
