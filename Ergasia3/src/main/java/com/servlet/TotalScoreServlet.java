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


@WebServlet("/TotalScoreServlet")
public class TotalScoreServlet extends HttpServlet {
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
			
			
			PreparedStatement st= con.prepareStatement("select sum(vathmos)/count(vathmos) as totalScore from vathmoi where id_mathiti=?;");			
			st.setInt(1, ID);
			
			ResultSet rs= st.executeQuery();
			
			
			out.print("<table border ='3'><tr><th>Total Score</th></tr>");
			
			while (rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getString("totalScore"));
				out.print("</td></tr>"); 
			}
			
			}			
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
 
			e.printStackTrace();
		} 			
	}

}
