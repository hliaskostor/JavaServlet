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
import javax.servlet.http.HttpSession;

import com.connect.ConnectClass;


@WebServlet("/findCategory")
public class findCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			Connection con = ConnectClass.dbCon();
			
			
			String username= request.getParameter("username");
			String password= request.getParameter("password");
			
			int ID=0; //Declaration
			
			
			PreparedStatement ps= con.prepareStatement("SELECT * FROM kathigites WHERE username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
						
			
			ResultSet rs=ps.executeQuery();
			
			
			boolean status=rs.next();
			
			if (status)
			{
				
				RequestDispatcher rd= request.getRequestDispatcher("ProfessorMenu.html");  
		        rd.forward(request, response);
		        
		        System.out.println("Successful entry kathigitis");
		        
		        
		        //For professor we need id_mathimatos 
		        PreparedStatement ps5= con.prepareStatement("select mathimata.id as id_mathimatos from kathigites,mathimata where kathigites.course= mathimata.name and kathigites.username=?;");								//EDWWWWWWW		
				ps5.setString(1, username);
				
				ResultSet rs5=ps5.executeQuery();
			
				while (rs5.next()) {   				    
					ID = rs5.getInt("id_mathimatos");				
				}												
				
			}
			else
			{						      	       
				PreparedStatement ps2= con.prepareStatement("SELECT * FROM mathites WHERE username=? and password=?");
				ps2.setString(1, username);
				ps2.setString(2, password);

				ResultSet rs2=ps2.executeQuery();	
				
				boolean status2=rs2.next();
				
				if (status2)
				{
					RequestDispatcher rd= request.getRequestDispatcher("StudentMenu.html");  
			        rd.forward(request, response);
			        
			        System.out.println("Successful entry mathitis");
			        
			        //For students, we need student id
			        PreparedStatement ps6= con.prepareStatement("select id from mathites where username=?;");				
					ps6.setString(1, username);
					
					ResultSet rs6=ps6.executeQuery();
				
					while (rs6.next()) {   					    
						ID = rs6.getInt("id");					
					}
				}
				else
				{
					RequestDispatcher rd= request.getRequestDispatcher("error.html");  
			        rd.forward(request, response);
			        
			        System.out.println("Unsuccessful entry,try again");
				}
			}
			
			
			HttpSession session = request.getSession();
			synchronized(session) {
				
				String name = request.getParameter("username");
				session.setAttribute("username", name);
				
				session.setAttribute("ID", ID);

				
				RequestDispatcher view = request.getRequestDispatcher("/MarksSemesterServlet");
		        view.include(request, response);
		        
		        RequestDispatcher view2 = request.getRequestDispatcher("/MarksCourseServlet");
		        view2.include(request, response);
		        
		        RequestDispatcher view3 = request.getRequestDispatcher("/MarksCourseProfServlet");
		        view3.include(request, response);
		        
		        RequestDispatcher view4 = request.getRequestDispatcher("/ScoreEntryServlet");
		        view4.include(request, response);
		        
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}
