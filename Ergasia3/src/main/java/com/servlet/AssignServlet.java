package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.ConnectClass;


@WebServlet("/AssignServlet")
public class AssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		try {

			Class.forName("org.postgresql.Driver"); 
			
			Connection con = ConnectClass.dbCon();
			
			String course= request.getParameter("course");			
			String name= request.getParameter("name");
			String surname= request.getParameter("surname");
			
			//Finding kathigites.id
			PreparedStatement ps= con.prepareStatement("SELECT id FROM kathigites WHERE (name=? and surname=?);");
			ps.setString(1, name);
			ps.setString(2, surname);
			
			
			ResultSet rs= ps.executeQuery();
			
			boolean status= rs.next();
			
			if (status)	//If professor exists
			{

				int ID= rs.getInt(1);	//ID
 
				//Updates id_kathigiti
				PreparedStatement ps2= con.prepareStatement("UPDATE mathimata SET id_kathigiti=? WHERE name=?;");
				
				ps2.setInt(1, ID); //id_kathigiti= ID
				ps2.setString(2, course); //name= course
				
				ps2.executeUpdate();
				
				
				PreparedStatement ps3= con.prepareStatement("UPDATE kathigites SET department=? WHERE id=?;");
				
				ps3.setString(1, course); //department= course
				ps3.setInt(2, ID); //id= id.kathigiti
				
				ps3.executeUpdate();
				
				
				System.out.println("Updated");
			}
			else
			{
				RequestDispatcher rd= request.getRequestDispatcher("error.html");  
		        rd.forward(request, response); 
			}
			
					
						
			con.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}					
	}
}
