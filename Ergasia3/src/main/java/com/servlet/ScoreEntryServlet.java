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
import javax.servlet.http.HttpSession;

import com.connect.ConnectClass;


@WebServlet("/ScoreEntryServlet")
public class ScoreEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			Class.forName("org.postgresql.Driver"); 
			
			Connection con = ConnectClass.dbCon();
			
			
			PrintWriter out = response.getWriter();
			
			int student_ID= Integer.parseInt(request.getParameter("student_ID"));
			int grade= Integer.parseInt(request.getParameter("grade"));
			
			HttpSession session = request.getSession();
			synchronized(session) {

			int ID= (Integer)session.getAttribute("ID");
			
			PreparedStatement ps= con.prepareStatement("update vathmoi set vathmos=? where id_mathiti=? and id_mathimatos=?;"); 
			ps.setInt(1, grade);
			ps.setInt(2, student_ID);
			ps.setInt(3, ID);
	
			int rows= ps.executeUpdate();
			
			if (rows>0) {
            	out.println("Successful grade entry");	          	
            }
									
			con.close();
			}
		
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}			
	}

}
