package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connect.ConnectClass;


@WebServlet("/MarksSemesterServlet")
public class MarksSemesterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = ConnectClass.dbCon();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

	
			HttpSession session = request.getSession();
			synchronized(session) {


			int ID= (Integer)session.getAttribute("ID");
				
			
			PreparedStatement st= con.prepareStatement("select semester, mathimata.name as course, vathmos as grade from mathimata,vathmoi where id_mathiti=? and mathimata.id=id_mathimatos order by semester asc;");
			st.setInt(1, ID);
			
			ResultSet rs= st.executeQuery();
			
		
			out.print("<table border ='3'><tr><th>Semester</th><th>Course</th><th>Grade</th></tr>");			
			
			while (rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getString("semester"));
				out.print("</td>"); 
				out.print("<td>");
				out.println(rs.getString("course"));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString("grade"));
				out.print("</td>");
	        	out.print("</tr>");
			}
			
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
 
			e.printStackTrace();
		} 			
	}


}
